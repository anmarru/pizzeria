package modelo.pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements Pagable{

    private List<LineaPedido> lineasPedido;
    private int id;
    private Date fecha;
    private float precioTotal;
    private EstadoPedido estado;
    private int contador_pedido=1;

    public Pedido( EstadoPedido estado) {
        this.id = contador_pedido;
        this.fecha = new Date();
        this.precioTotal =0;
        this.lineasPedido= new ArrayList<>();
        this.estado= EstadoPedido.PENDIENTE;
    }
    
    
    
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", fecha=" + fecha + ", precioTotal=" + precioTotal + ", estado=" + estado + "]";
    }


    public void agregarLineaPedido(LineaPedido lineaPedido){
        lineasPedido.add(lineaPedido);
        this.precioTotal+= lineaPedido.getCantidad() * lineaPedido.getProducto().getPrecio();
    
    }

    public List<LineaPedido> getLineasPedido() {
        return lineasPedido;
    }

    public void setLineasPedido(List<LineaPedido> lineasPedido) {
        this.lineasPedido = lineasPedido;
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

    public int getContador_pedido() {
        return contador_pedido;
    }

    public void setContador_pedido(int contador_pedido) {
        this.contador_pedido = contador_pedido;
    }



    @Override
    public void pagar(double cantidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pagar'");
    }

    

    
}
