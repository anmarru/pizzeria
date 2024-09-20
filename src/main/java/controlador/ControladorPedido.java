package controlador;

import modelo.pedido.Pedido;
import modelo.producto.Producto;

public class ControladorPedido {
    /*debe de tener un metodo 
     * finPedido(Pagable metodo){
     * metodo.pagar() }
     */
    
     Pedido pedidoactual;

     public void agregarLineaPedido(Producto producto, int cantidad){
         if (pedidoactual== null){
             pedidoactual.agregarLineaPedido(producto);
         }


     }
        
}
