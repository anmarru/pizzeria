package modelo.pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.producto.Producto;

public class Pedido implements Pagable{

    private Pagable metodoDePago;
    private List<Producto> lineasPedido;
    private int id;
    private Date fecha;
    private float precioTotal;
    private int cliente_id;
    private EstadoPedido estado;

    public Pedido(int id, Date fecha, float precioTotal, EstadoPedido estado,int cliente_id) {
        this.id = id;
        this.fecha = new Date();
        this.precioTotal = precioTotal;
        this.lineasPedido= new ArrayList<>();
        this.cliente_id= cliente_id;
        this.estado= EstadoPedido.PENDIENTE;
    }

    public int getId() {
        return id;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }



    public List<Producto> getLineasPedido() {
        return lineasPedido;
    }

    public void setLineasPedido(List<Producto> lineasPedido) {
        this.lineasPedido = lineasPedido;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Pagable getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(Pagable metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
    
    
     //si el pedido esta entregado se finaliza
    public void finalizar(){
        this.estado= EstadoPedido.ENTREGADO;

        System.out.println("pedido finalizado");
    }

    @Override
    public void pagar(double cantidad) {
        System.out.println("pago realizado "+ cantidad);
    }

    
    public void agregarLineaPedido(Producto producto){

        lineasPedido.add(producto);
        
    }

    
}
