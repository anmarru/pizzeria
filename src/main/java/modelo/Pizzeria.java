package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.cliente.Cliente;
import modelo.pedido.EstadoPedido;
import modelo.pedido.Pedido;
import modelo.pedido.Size;
import modelo.producto.Bebida;
import modelo.producto.Pasta;
import modelo.producto.Producto;

public class Pizzeria {
    public static void main(String[] args) {
        // Crear una lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "54236985p", "Ana", "Calle 456", "456213698", "ana@gmail.com", "0000"));
        clientes.add(new Cliente(2, "12345678a", "Luis", "Calle 123", "123456789", "luis@gmail.com", "1234"));
        
        // Crear una lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, new Date(), 14f, EstadoPedido.PENDIENTE, 1));
        pedidos.add(new Pedido(2, new Date(), 20f, EstadoPedido.PENDIENTE, 2));
        
        // Simular realizar un pedido
        Cliente cliente = clientes.get(0); // Seleccionamos a Ana
        Pedido pedido = pedidos.get(0); // Seleccionamos el primer pedido
        

       /* public List<Producto> lista_productos(){

        ArrayList<Producto> nombre_productos=new ArrayList<>();

        nombre_productos.add(new Bebida(1, "agua", 1.50, Size.pequeña, 1));
        nombre_productos.add(new Bebida(2,"Cocacola",2.0, Size.grande, 2));
        nombre_productos.add(new Bebida(3, "cerveza", 3.00,Size.mediana, 3));
        
        nombre_productos.add(new Pasta(1, "carbonara", 14.0, 4,1 ));

        return nombre_productos;
        
    }
 */

        /* // Verificar contraseña
        if (cliente.verificarPassword("0000")) {
            cliente.realizarPedido(pedido);
            
            // Imprimir nombre del cliente y datos del pedido
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println(pedido);
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        // Acceder a un pedido específico de otro cliente
        Cliente otroCliente = clientes.get(1); // Luis
        Pedido pedidoDeLuis = pedidos.get(1); // Segundo pedido
        
        if (otroCliente.verificarPassword("1234")) {
            otroCliente.realizarPedido(pedidoDeLuis);
            
            // Imprimir nombre de Luis y datos de su pedido
            System.out.println("Cliente: " + otroCliente.getNombre());
            System.out.println(pedidoDeLuis);
        } else {
            System.out.println("Contraseña incorrecta.");
        } */
    }
}
