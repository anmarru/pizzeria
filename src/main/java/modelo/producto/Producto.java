package modelo.producto;
import java.util.ArrayList;
import java.util.List;

public abstract class Producto {
    
    
    protected int id;
    protected String nombre;
    protected double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Producto> lista_productos(){

        ArrayList<Producto> nombre_productos=new ArrayList<>();

       // Bebida cocacola= new Bebida(id, nombre, precio, Size.grande, id);
       // nombre_productos.add(new Bebida(1,"Cocacola",Size.grande, 2));
       //nombre_productos.add(cocacola);
        
        return nombre_productos;
        
    }


    
}
