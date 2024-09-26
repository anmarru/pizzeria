package modelo.producto;

import modelo.pedido.SIZE;

public class Pizza  extends Producto{
    
    public SIZE size;

    private int ingredientes_id;//se relaciona con el id de ingredientes

    public Pizza(int id, String nombre, double precio, SIZE size,  int ingredientes_id) {
        super(id, nombre, precio);
        this.size = size;
      
        this.ingredientes_id= ingredientes_id;
    }

    public SIZE getsize() {
        return size;
    }

    public void setSIZE(SIZE size) {
        size = size;
    }

    

    public int getIngredientes_id() {
        return ingredientes_id;
    }

    public void setIngredientes_id(int ingredientes_id) {
        this.ingredientes_id = ingredientes_id;
    }
    
    
}
