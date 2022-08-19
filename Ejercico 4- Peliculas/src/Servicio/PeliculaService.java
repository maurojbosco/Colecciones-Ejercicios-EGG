package servicio;

import java.util.Scanner;

import entidad.Pelicula;

import java.util.ArrayList;

public class PeliculaService {
    private ArrayList<Pelicula> pelis = new ArrayList<>();
    private Scanner sn = new Scanner(System.in);

    public ArrayList<Pelicula> crearPeliculas() {
        do {
            System.out.println("Ingrese el nombre de la película");
            String nombre = sn.next();
            System.out.println("Ingrese el director de la película");
            String director = sn.next();
            System.out.println("Ingrese la duración de la película en hs");
            Double duracion = Double.parseDouble(sn.next());
            Pelicula pelicula = new Pelicula(nombre, director, duracion);
            this.pelis.add(pelicula);
            System.out.println("Ingrese cualquier caracter para crear otra película o 's' para salir");
        } while (sn.next().charAt(0) != 's');
        return pelis;
    }

    // Método que muesta en pantalla todas las películas
    public void mostrarPeliculas() {
        System.out.println(this.pelis);
    }

    // Método que ordena las películas de acuerdo a su duración( de mayor a menor) y
    // las muestra en pantalla
    public void ordenaMayorAMenor() {
        pelis.sort(Pelicula.compararDuracionMayMen);
        System.out.println("Películas ordenadas por duración de mayor a menor:");
        System.out.println(this.pelis);
    }

    // Método que ordena las películas de acuerdo a su duración( de menor a mayor) y
    // las muestra en pantalla
    public void ordenaMenorAMayor() {
        pelis.sort(Pelicula.compararDuracionMenMay);
        System.out.println("Películas ordenadas por duración de menor a mayor:");
        System.out.println(this.pelis);
    }

    // Método que ordena las películas por título, alfabéticamente y las muestra en
    // pantalla
    public void ordenaTitulo() {
        pelis.sort(Pelicula.compararTituloAlf);
        System.out.println("Películas ordenadas por título alfabéticamente");
        System.out.println(this.pelis);
    }

    // Método que ordena las películas por director, alfabéticamente y las muestra
    // en
    // pantalla
    public void ordenaDirector() {
        pelis.sort(Pelicula.compararDirectorAlf);
        System.out.println("Películas ordenadas por director alfabéticamente:");
        System.out.println(this.pelis);
    }

}