/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones: 
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. */

import servicio.PeliculaService;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Se intancia un objeto servicio para poder llamar a sus métodos
        PeliculaService pelser = new PeliculaService();
        // Se llama al método que crea Películas y las guarda en un ArrayList
        pelser.crearPeliculas();
        // Se llama al método que muestra películas
        pelser.mostrarPeliculas();
        // Se llama al método que muestra las películas de mayor a menor segun su
        // duración
        pelser.ordenaMayorAMenor();
        // Se llama al método que muestra las películas de menor a mayor segun su
        // duración
        pelser.ordenaMenorAMayor();
        // Se llama al método que muestra las películas ordenadas alfabéticamente según
        // sus títulos
        pelser.ordenaTitulo();
        // Se llama al método que muestra las películas ordenadas alfabéticamente según
        // sus directores
        pelser.ordenaDirector();
    }
}
