package servicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import entidad.Pais;

public class PaisService {
    private HashSet<Pais> paises = new HashSet<>();
    private Scanner sn = new Scanner(System.in);

    // Método que pide un país en un bucle, guarda el país en un conjunto y después
    // le pregunta al usuario si quiere guardar otro país o si quiere salir, si
    // decide salir, se muestran todos los países guardados en el conjunto por
    // pantalla.
    public void crearPaises() {
        do {
            System.out.println("Ingrese un país");
            paises.add(new Pais(sn.next()));
            System.out.println("Ingrese cualquier caracter para guardar otro país o 's' para salir");
        } while (sn.next().charAt(0) != 's');
        System.out.println(paises);
    }

    // Método que muestra el conjunto ordenado alfabéticamente por pantalla
    public void ordenarPaises() {
        ArrayList<Pais> paises1 = new ArrayList<>(paises);
        paises1.sort(Pais.compararNombre);
        System.out.println("Paises ordenados alfabéticamente:");
        System.out.println(paises1);
    }
    // Método que le pide un país al usuario y recorre el conjunto con un
    // Iterator, busca el país en el conjunto y si está en el conjunto elimina el
    // país que ingresó el usuario y muestra el conjunto por pantalla. Si el país no
    // se encuentra en el conjunto tammbién lo informa por pantalla
    public void eliminarPais(){
        System.out.println("ingrese el país que desea eliminar");
        String pais = sn.next();
        boolean flag = false;
        Iterator<Pais> iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNombre().equals(pais)) {
                iterator.remove();
                flag = true;
            }
        }
        if (flag) {
            System.out.println(paises);
        } else {
            System.out.println("El país ingresado no se encuentra en el conjunto");
            
        }
    }

}
