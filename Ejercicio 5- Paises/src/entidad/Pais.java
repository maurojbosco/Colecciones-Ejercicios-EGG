package entidad;

import java.util.Comparator;

public class Pais {
    // Atributos
    private String nombre;
    // Consructores

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // To String

    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + "]";
    }

    // Comparator
    public static Comparator<Pais> compararNombre = new Comparator<Pais>(){
        @Override
        public int compare(Pais o1, Pais o2){
            return o1.getNombre().compareTo(o2.getNombre());
        }
            
    };

}
