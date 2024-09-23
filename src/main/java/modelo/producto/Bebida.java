package modelo.producto;

import modelo.pedido.Size;

public class Bebida extends Producto{
    
    
    public Size SIZE;
    private int producto_id;// bebida esta relacionada con el id del producto
    
    public Bebida(int id, String nombre, double precio, Size sIZE, int producto_id) {
        super(id, nombre, precio);
        SIZE = sIZE;
        this.producto_id = producto_id;
    }

    public Size getSIZE() {
        return SIZE;
    }

    public void setSIZE(Size sIZE) {
        SIZE = sIZE;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    
    

    
    
}
