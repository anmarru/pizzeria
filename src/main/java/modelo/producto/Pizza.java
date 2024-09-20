package modelo.producto;

import java.util.ArrayList;
import java.util.List;

import modelo.pedido.Ingrediente;

public class Pizza  extends Producto{
    
    enum size{grande, mediana, pequeña};

    private List <Ingrediente> ingredientes;

    public size ZISE;

    public Pizza(int id, String nombre, double precio, size zISE) {
        super(id, nombre, precio);
        ZISE = zISE;
        this.ingredientes=new ArrayList<>();
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
    
    
}
