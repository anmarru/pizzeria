package modelo.producto;

import modelo.pedido.SIZE;

public class Bebida extends Producto{
    
    
    public SIZE size;
    private int producto_id;// bebida esta relacionada con el id del producto
    
    public Bebida(int id, String nombre, double precio, SIZE size, int producto_id) {
        super(id, nombre, precio);
        size = size;
        this.producto_id = producto_id;
    }

    public SIZE getsize() {
        return size;
    }

    public void setsize(SIZE size) {
        size = size;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    
    

    
    
}
