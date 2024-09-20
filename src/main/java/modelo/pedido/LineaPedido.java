package modelo.pedido;

import modelo.producto.Producto;

public class LineaPedido {
    private int id;
    private int cantidad;
    private int pedido_id;
    
    private Producto producto;

    public LineaPedido(int id, int cantidad, int pedido_id, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.pedido_id=pedido_id;
        this.producto=producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad= cantidad;
        
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }
    

    
}
