package Entidad;

import java.util.Comparator;

public class Pelicula {
    // atributos
    private String titulo;
    private String director;
    private double duracion;

    // Constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    // To String
    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + "]";
    }

    // Comparators
    public static Comparator<Pelicula> compararDuracionMayMen = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o2.getDuracion(), o1.getDuracion());
        }

    };
    public static Comparator<Pelicula> compararDuracionMenMay = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o1.getDuracion(), o2.getDuracion());
        }

    };
    public static Comparator<Pelicula> compararTituloAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getTitulo().compareTo(o1.getTitulo());
        }

    };
    public static Comparator<Pelicula> compararDirectorAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDirector().compareTo(o1.getDirector());
        }

    };
}
