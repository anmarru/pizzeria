package modelo.producto;

public class Bebida extends Producto{
    
    
    public Size size;
    
    public Bebida(int id, String nombre, double precio, Size size) {
        super(id, nombre, precio);
        this.size = size;
        
    }

    public Size getsize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bebida [size=" + size + "]";
    }

    

    
    

    
    
}
