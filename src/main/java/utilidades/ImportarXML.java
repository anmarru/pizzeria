package utilidades;

import modelo.cliente.Cliente;
import modelo.cliente.Clientes;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class ImportarXML {

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
