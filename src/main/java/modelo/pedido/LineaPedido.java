package modelo.pedido;
import java.util.ArrayList;
import java.util.List;

import modelo.producto.Producto;

public class LineaPedido {
    private int id;
    private int cantidad;
    private int pedido_id;
    private int producto_id;
    
    private List<Producto> productos;

    public LineaPedido(int id, int cantidad, int pedido_id, int producto_id) {
        this.id = id;
        this.cantidad = cantidad;
        this.pedido_id=pedido_id;
        this.productos=new ArrayList<>();
        
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    

    public int getProducto_id() {
        return producto_id;
    }



    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }



    public List<Producto> getProductos() {
        return productos;
    }



    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    

    
}
