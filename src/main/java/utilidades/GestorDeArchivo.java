package utilidades;

import modelo.cliente.Cliente;
import modelo.cliente.Clientes;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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


}
