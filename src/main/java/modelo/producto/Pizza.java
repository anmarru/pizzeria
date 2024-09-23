package modelo.producto;

import java.util.ArrayList;
import java.util.List;

import modelo.pedido.Ingrediente;

public class Pizza  extends Producto{
    
    enum size{grande, mediana, pequeña};

    private List <Ingrediente> ingredientes;

    public size ZISE;

    private int producto_id;// se relaciona con el id de producto
    private int ingredientes_id;//se relaciona con el id de ingredientes

    public Pizza(int id, String nombre, double precio, size zISE, int producto_id, int ingredientes_id) {
        super(id, nombre, precio);
        ZISE = zISE;
        this.producto_id=producto_id;
        this.ingredientes=new ArrayList<>();
        this.ingredientes_id= ingredientes_id;
    }

    public size getZISE() {
        return ZISE;
    }

    public void setZISE(size zISE) {
        ZISE = zISE;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }


    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ingredientes.toString();
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
