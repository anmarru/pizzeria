package modelo.pedido;

import java.util.List;

import modelo.producto.Producto;

public class Ingrediente {
    
    private String nombre;
    private List<String> alergenos;
    private long id;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, List<String> alergenos) {
        this.nombre = nombre;
        this.alergenos = alergenos;
        this.id = id;

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

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
    @Override
    public String toString() {
        return "Ingrediente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alergenos=" + alergenos +
                '}';
    }

    

}
