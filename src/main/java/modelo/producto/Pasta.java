package modelo.producto;

import java.util.ArrayList;
import java.util.List;

import modelo.pedido.Ingrediente;

public class Pasta extends Producto {

    protected List <Ingrediente> ingredientes;
    private int producto_id;// se relaciona con el producto
    private int ingredientes_id;//se relaciona con id de los ingrediemtes

    public Pasta(int id, String nombre, double precio, int producto_id, int ingredientes_id) {
        super(id, nombre, precio);
        this.producto_id=producto_id;
        this.ingredientes=new ArrayList<>();
        this.ingredientes_id=ingredientes_id;
    }
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public int getProducto_id() {
        return producto_id;
    }
    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }
    public int getIngredientes_id() {

        return ingredientes_id;
    }
    public void setIngredientes_id(int ingredientes_id) {
        this.ingredientes_id = ingredientes_id;
    }
    
    
    
}
