package modelo.pedido;

import java.util.List;

public class Ingrediente {
    
    private String nombre;
    private List<String> alergenos;
    private int id;

    // Constructor para inicializar los atributos
    public Ingrediente(String nombre, List<String> alergenos, int id) {
        this.nombre = nombre;
        this.alergenos = alergenos;
        this.id = id;
    }

    // Getters y setters
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "Ingrediente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alergenos=" + alergenos +
                '}';
    }
}
