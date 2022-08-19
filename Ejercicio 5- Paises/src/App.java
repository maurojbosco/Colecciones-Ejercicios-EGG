
/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario */
import servicio.PaisService;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Se instancia un objeto servicio para poder accerder a sus métodos
        PaisService paser = new PaisService();
        // Se llama al método que crea Paises, los guarda en un conjunto y los muestra
        // por pantalla
        paser.crearPaises();
        // Se llama al método que ordena los paises alfabéticamente y los muestra por
        // pantalla
        paser.ordenarPaises();
        // Se llama al método que le pide un país al usuario y si lo encuentra en el
        // conjunto lo elimina y muestra el conjunto actualizado por pantalla
        paser.eliminarPais();
    }
}
