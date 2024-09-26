package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.ControladorCilente;
import modelo.cliente.Cliente;
import modelo.pedido.EstadoPedido;
import modelo.pedido.Ingrediente;
import modelo.pedido.Pedido;
import modelo.pedido.SIZE;
import modelo.producto.Bebida;
import modelo.producto.Pasta;
import modelo.producto.Pizza;
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
        pedidos.add(new Pedido(2, new Date(), 14f, EstadoPedido.PENDIENTE, 1));
        pedidos.add(new Pedido(2, new Date(), 20f, EstadoPedido.PENDIENTE, 2));
        
        // Simular realizar un pedido
        Cliente cliente1 = clientes.get(0); // Seleccionamos a Ana
        Pedido pedido1 = pedidos.get(0); // Seleccionamos el primer pedido
        
        //lista de alergenos por ingredientes
        List <String> alergenos_queso= new ArrayList<>(List.of("gluten", "lactosa"));
        List <String> alergeno_pan= new ArrayList<>(List.of("gluten"));

        List <String> lista_ingredientes= new ArrayList<>(List.of(""));
        
    

        //Ingrediente ingredientes1=new Ingrediente("queso", alergenos_queso,);
    

       

        cliente1.realizarPedido(pedido1);
        System.out.println("pedido hercho");
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
         
        Producto producto=new Pizza(1,"Peperoni",9.50,SIZE.GRANDE,2);
            
        
         ControladorCilente controlador_cliente= new ControladorCilente();
         controlador_cliente.agregarLieaPedido(producto, 1);

    }
    public List<Producto> lista_productos(){

        ArrayList<Producto> nombre_productos=new ArrayList<>();

        nombre_productos.add(new Bebida(1, "agua", 1.50, SIZE.PEQUEÑA, 1));
        nombre_productos.add(new Bebida(2,"Cocacola",2.0, SIZE.MEDIANA, 2));
        nombre_productos.add(new Bebida(3, "cerveza", 3.00,SIZE.GRANDE, 3));
        
        nombre_productos.add(new Pasta(1, "carbonara", 14.0, 4,1 ));

        return nombre_productos;
        
    }
 
}
