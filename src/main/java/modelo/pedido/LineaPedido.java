package modelo.pedido;
import modelo.producto.Producto;

public class LineaPedido {
    private int id;
    private int cantidad;
    private int contador_lineas;
    private Producto producto;
    

    public LineaPedido(int cantidad, Producto producto) {
        this.id = contador_lineas++;
        this.cantidad = cantidad;
        this.producto=producto;
        
    }


    

    @Override
    public String toString() {
        return "LineaPedido [id=" + id + ", cantidad=" + cantidad + ", producto=" + producto + "]";
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
        this.cantidad = cantidad;
    }


    public int getContador_lineas() {
        return contador_lineas;
    }


    public void setContador_lineas(int contador_lineas) {
        this.contador_lineas = contador_lineas;
    }


    public Producto getProducto() {
        return producto;
    }


    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
    

    
    

    
}
