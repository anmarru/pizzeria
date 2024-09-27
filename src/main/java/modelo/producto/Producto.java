package modelo.producto;

public abstract class Producto {
    
    
    protected int id;
    protected String nombre;
    protected double precio;
    protected int contador_producto;

    public Producto(int id, String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = contador_producto++;
    }

    
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + super.toString()+ "]";
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

    public int getContador_producto() {
        return contador_producto;
    }

    public void setContador_producto(int contador_producto) {
        this.contador_producto = contador_producto;
    }

   

    

    
}
