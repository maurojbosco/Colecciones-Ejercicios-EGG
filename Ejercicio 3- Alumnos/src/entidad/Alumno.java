package entidad;

import java.util.ArrayList;

public class Alumno {
    // Atributos
    private String nombre;
    private ArrayList<Integer> notas;
    // Constructores

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumno() {
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    // To String
    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", notas=" + notas + "]";
    }

}
