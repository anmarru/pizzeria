package modelo;

import java.util.ArrayList;
import java.util.List;

import controlador.ControladorCilente;
import controlador.ControladorPedido;
import modelo.pedido.Ingrediente;
import modelo.pedido.Pagable;
import modelo.pedido.PagarTarjeta;
import modelo.producto.Bebida;
import modelo.producto.Pizza;

public class Pizzeria {
    public static void main(String[] args) {

        ControladorCilente controladorCilente= new ControladorCilente();
        ControladorPedido controladorPedido= new ControladorPedido(null);


        controladorCilente.registrarCliente(1, "54236985p", "Ana", "Calle 456", "456213698", "ana@gmail.com", "5555");
       // controladorCilente.registrarCliente(2, "12345678a", "Luis", "Calle 123", "123456789", "luis@gmail.com", "1234"); 
        
        controladorCilente.autenticarCliente("Ana", "5555","54236985p" );

        List<Ingrediente> lista_ingredientes= new ArrayList<>();
        lista_ingredientes.add(new Ingrediente("peperoni",List.of("sulfito","lacteo")));
        lista_ingredientes.add(new Ingrediente("queso",List.of("lacteo")));
        lista_ingredientes.add(new Ingrediente("piña",List.of()));
        lista_ingredientes.add(new Ingrediente("pechuga de pollo",List.of("aves")));
        lista_ingredientes.add(new Ingrediente("champiñones",List.of()));
        
        
        controladorPedido.agregarLineaPedido(new Pizza(1, "hawai",8.5,modelo.producto.Size.MEDIANA,lista_ingredientes), 2);
        controladorPedido.agregarLineaPedido(new Bebida(2, "agua", 1.5, modelo.producto.Size.GRANDE), 2);
        
    
        
        controladorPedido.getPedido().getLineasPedido().forEach(pedidos-> System.out.println(pedidos));
        Pagable pagar= new PagarTarjeta();
    
        System.out.println(controladorCilente.getCliente_Actual());
        controladorPedido.finalizarPedido(pagar);
        controladorPedido.entregarPedido();
        














    
        
    } 
 
}
