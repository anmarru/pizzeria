package modelo.pedido;

import java.util.List;

public class Ingrediente {
    
    public String nombre;
    public List<String> alergenos;
    public Ingrediente(String nombre, List<String> alergenos) {
        this.nombre = nombre;
        this.alergenos = alergenos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<String> getAlergenos() {
        return alergenos;
    }
    public void setAlergenos(List<String> alergenos) {
        this.alergenos = alergenos;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    
    

    
}
