package controlador;

import modelo.cliente.Cliente;
import modelo.pedido.EstadoPedido;
import modelo.pedido.LineaPedido;
import modelo.pedido.Pagable;
import modelo.pedido.Pedido;
import modelo.producto.Producto;

public class ControladorPedido {

    private static Pedido pedido;
    private static Cliente cliente;

    public ControladorPedido(Cliente cliente){
        this.cliente=cliente;
    }
    
    public void finalizarPedido(Pagable pagable){
        if(cliente==null){
            System.out.println("NO HAY USUARIO ");
            return;
        }
        if(pedido==null){
            System.out.println("No hay pedido ");
            return;
        }
        pedido.setEstado(EstadoPedido.ENTREGADO);
        System.out.println("EL ESTADO DEL PEDIDO ES: "+pedido.getEstado());

        pagable.pagar(pedido.getPrecioTotal());

    }
    

    public void agregarLineaPedido(Producto producto, int cantidad) {
        if (cliente == null) {
            System.out.println("NO SE HA REGISTADO NINGUN USUARIO ");
            return;
        }
        if (pedido == null) {
            crearNuevoPedido();
        }

        pedido.agregarLineaPedido(new LineaPedido(cantidad, producto));
    }

    private void crearNuevoPedido() {
        pedido = new Pedido(EstadoPedido.PENDIENTE);
    }

    public void cancelarPedido() {
        if (cliente == null) {
            System.out.println("NO HAY USUARIO..");
            return;
        }
        if (pedido == null) {
            System.out.println("NO HAY PEDIDO.. ");
            return;
        }
        pedido.setEstado(EstadoPedido.CANCELADO);

        System.out.println("EL ESTADO DEL PEDIDO ES: " + pedido.getEstado());
    }

    public void entregarPedido(){
        if(cliente==null){
            System.out.println("NO HAY USUARIO ");
            
        }
        if(pedido==null){
            System.out.println("NO HAY PEDIDO ");
            return;
        }
        pedido.setEstado(EstadoPedido.ENTREGADO);
        System.out.println("PEDIDO  "+ pedido.getEstado());
    }



    public static Pedido getPedido() {
        return pedido;
    }



    public static void setPedido(Pedido pedido) {
        ControladorPedido.pedido = pedido;
    }

    




    
}
