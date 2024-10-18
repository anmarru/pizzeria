package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.cliente.Cliente;

import utilidades.GestorDeArchivo;

public class Pizzeria {
    public static void main(String[] args) {

       /* ControladorCilente controladorCilente= new ControladorCilente();
        ControladorPedido controladorPedido= new ControladorPedido(null);


        controladorCilente.registrarCliente(1, "54236985p", "Ana", "Calle 456", "456213698", "ana@gmail.com", "5555", true);
       // controladorCilente.registrarCliente(2, "12345678a", "Luis", "Calle 123", "123456789", "luis@gmail.com", "1234"); 
        
        controladorCilente.autenticarCliente("Ana", "5555","54236985p" );

        List<Ingrediente> lista_ingredientes= new ArrayList<>();
        lista_ingredientes.add(new Ingrediente("peperoni",List.of("sulfito","lacteo")));
        lista_ingredientes.add(new Ingrediente("queso",List.of("lacteo")));
        lista_ingredientes.add(new Ingrediente("piña",List.of()));
        lista_ingredientes.add(new Ingrediente("pechuga de pollo",List.of("aves")));
        lista_ingredientes.add(new Ingrediente("champiñones",List.of()));
        
        
        //controladorPedido.agregarLineaPedido(new Pizza(1, "hawai",8.5,modelo.producto.Size.MEDIANA,lista_ingredientes), 2);
        //controladorPedido.agregarLineaPedido(new Bebida(2, "agua", 1.5, modelo.producto.Size.GRANDE), 2);
        
    
        
        controladorPedido.getPedido().getLineasPedido().forEach(pedidos-> System.out.println(pedidos));
        Pagable pagar= new PagarTarjeta();
    
        System.out.println(controladorCilente.getCliente_Actual());
        controladorPedido.finalizarPedido(pagar);
        controladorPedido.entregarPedido();*/
        

    //FUNCION LEER CLIENTES
        List<Cliente> clientes= GestorDeArchivo.leerCliente();
        clientes.forEach(System.out::println);

    //FUNCION EXPORTAR CLIENTESXML
        List<Cliente> listaClientes= new ArrayList<>();
        listaClientes.add(new Cliente(1,"5235474Q","nico","calle x 12","652358896","nico@gmail.com","14563A", true));
        listaClientes.add(new Cliente(2, "22203344F", "María", "C/Sol 5", "678954321", "m.gonzalez@correo.com", "23456B", false));
        listaClientes.add(new Cliente(3, "33301234A", "Carlos", "Av. Libertad 3", "690123456", "c.lopez@correo.com", "34567C", true));

        String nombreArchivo= "clientes.xml";
       GestorDeArchivo.exportarClienteAxml(listaClientes,nombreArchivo);



    //Importar xml a objetos cliente
        String rutaArchivoXML="clientes.xml";
        //creo mi lista para almacenar los obj importados del xml
        List<Cliente> listaClientes2= GestorDeArchivo.importarClientesDesdeArchivoXML(rutaArchivoXML);
        if(listaClientes2 !=null){
            for(Cliente c: listaClientes2){
                System.out.println(c);
            }
        }else {
            System.out.println("no se pudieron importar los clientes ");
        }







    
        
    } 
 
}
