package utilidades;
import com.opencsv.*;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.opencsv.exceptions.CsvValidationException;
import modelo.cliente.Cliente;
import modelo.cliente.Clientes;
import modelo.pedido.Ingrediente;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileWriter;

public class GestorDeArchivo {

    public  static List<Cliente> leerCliente(){

        List<Cliente> listaCliente= new ArrayList<>();
        try(BufferedReader reader= new BufferedReader(new FileReader("clientes.txt"))){
            String lineas;
            while ((lineas= reader.readLine()) !=null){
                String[] campos= lineas.split("[;,|]");
                //quito espacios dentro de cada campo
                for(int i=0; i <campos.length; i++){
                    campos[i]= campos[i].replaceAll("\\s+","");//elimina todos los espacios q tenga
                }

                long id=Long.parseLong(campos[0]) ;
                String dni=campos[1];
                String nombre=campos[2];
                String direccion= campos[3];
                String telefono= campos[4];
                String  email= campos [5];
                String password= campos[6];
                boolean esAdmin= Boolean.parseBoolean(campos[7]);

                Cliente cliente= new Cliente(id, dni, nombre,direccion,telefono,email, password,esAdmin);
                listaCliente.add(cliente);
            }


        }catch (IOException e){
            System.out.println("EARROR AL LEER EL ARCHIVO: "+ e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Error de formato en el archivo: "+ e.getMessage());
        }
        return  listaCliente;
    }

    public static void exportarClienteAxml(List<Cliente> listaClientes, String nombreArchivo){
        try{
            //contiene mi lista de clientes
            Clientes cliente=new Clientes(listaClientes);

            JAXBContext context=JAXBContext.newInstance(Clientes.class);
            Marshaller marshaller=context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(cliente,new File(nombreArchivo));
            System.out.println("exportado..");
        }catch (JAXBException e){

            e.printStackTrace();
            System.out.println(("error "+e.getMessage()));
        }

    }

    public static List<Cliente> importarClientesDesdeArchivoXML(String ruraArchivo){

        try{
            JAXBContext context = JAXBContext.newInstance(Clientes.class);

            Unmarshaller unmarshaller= context.createUnmarshaller();
            //leo el archivo y lo convierto a obCliente
            File archivoXml=new File(ruraArchivo);
            Clientes clientes= (Clientes)unmarshaller.unmarshal(archivoXml);

            //devuelvo la lista
            return  clientes.getClientes();


        }catch (JAXBException e){
            e.printStackTrace();
        }
        return null;
    }

    public static  void exportarIngredienteCSV(List<Ingrediente>listaDeIngredientes) {
            List<Ingrediente>listaIngredientes;
        try (PrintWriter pw = new PrintWriter("Ingredientes.csv")) {
            StatefulBeanToCsv<Ingrediente> beanToCsv = new
                    StatefulBeanToCsvBuilder<Ingrediente>(
                    pw).build();
            beanToCsv.write(listaDeIngredientes);
        } catch (FileNotFoundException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        }
       /* try (CSVWriter writer = new CSVWriter(new FileWriter("ficheroIngredientes.CSV"))) {


            String[] encabezado = {"NOMBRE","ALERGENOS", "ID"};
            writer.writeNext(encabezado);

            for (Ingrediente ig : listaDeIngredientes) {
                //lista alergenos a cadena separados por comas
                String alergenos = String.join(",", ig.getAlergenos());
                String[] datosIngrediente = {ig.getNombre(), alergenos,String.valueOf(ig.getId()) };
                //escribo datos en ingrediente
                writer.writeNext(datosIngrediente);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }


    public static List<Ingrediente> importarIngredientesDesdeCSV(String nombreArchivo) {

        List<Ingrediente> ingredientes= new ArrayList<>();

        try (
                CSVReader reader= new CSVReaderBuilder(new FileReader(nombreArchivo))
                .withCSVParser(new CSVParserBuilder().withSeparator(',').build())//separador
                .withSkipLines(1)//me salto la primera linea q es el encabezado
                .build()){
                String[] linea;
                //leo cada linea del archivoCSV

            while ((linea = reader.readNext()) !=null){

                if(linea.length==0 || linea[0].trim().isEmpty()){
                    continue;
                }

                if(linea.length !=3){
                    System.out.println("linea sin campos necesarios ");
                }

                //parseo alergenos id y nombre
                //creo la lista de alergenos, si esta vacia creo la lista vacia, y si tiene alergenos creo una lista  los agrego y los separo con ,
                String nombre= linea[0].replace("\"","").trim();//elimino comillas y espacios
                List<String> alergenos= linea[1].isEmpty() ? new ArrayList<>() : Arrays.asList(linea[1].split(","));
                String idStr= linea[2].replace("\"","").trim();//elimino las comillas y los espacios

                int id;
                try{
                    id=Integer.parseInt(idStr);
                }catch (NumberFormatException e){
                    System.out.println("error ie id no es numero valiso");
                    continue;
                }


                //creo el objeto ingrediente y lo agrego a la lista
                Ingrediente ingrediente= new Ingrediente(nombre, alergenos, id);
                ingredientes.add(ingrediente);

                System.out.println("Importando...");
            }


        }catch (IOException  | CsvValidationException e){
            e.printStackTrace();
        }
        return ingredientes;
    }
}
