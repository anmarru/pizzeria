package modelo;


import java.util.Date;

import modelo.cliente.Cliente;
import modelo.pedido.EstadoPedido;
import modelo.pedido.Pedido;

public class Pizzeria {
    public static void main(String[] args) {
        

        Cliente cliente=new Cliente(1,"54236985p","ana", "calle 456", "456213698","ana.gmail.com", "0000");
        
        Cliente cliente2=new Cliente(2, "5246987u", "nicolay", "castillo 11", "689574123", "n@gmail.com", "0000");
       // cliente.realizarPedido(2," 19-09-24",15f, estado.);
       //cliente.realizarPedido();

        Pedido pedido1=new Pedido(01, new Date(),14f , EstadoPedido.PAGADO, 1);
        cliente.verificarPassword("0000");
        
        cliente2.realizarPedido(pedido1);


        
    }
}
