package modelo.producto;

import modelo.pedido.Size;

public class Bebida extends Producto{
    
    //enum zise{grande, mediana, pequeña}
    
    public Size SIZE;
    
    public Bebida(int id, String nombre, double precio, Size SIZE) {
        super(id, nombre, precio);
        this.SIZE = SIZE;
    }
    

    
    
}
