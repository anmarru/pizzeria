package modelo.producto;

import java.util.ArrayList;
import java.util.List;

import modelo.pedido.Ingrediente;

public class Pasta extends Producto {

    protected List <Ingrediente> ingredientes;
    
    public Pasta(int id, String nombre, double precio) {
        super(id, nombre, precio);
        
        this.ingredientes=new ArrayList<>();
    }
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
