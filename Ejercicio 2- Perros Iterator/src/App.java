
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada. */
import java.util.*;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in).useDelimiter("\n");
        //Se crea una lista de String
        ArrayList<String> razas = new ArrayList();
        //Se crea una variable para permitirle al usuario salir del bucle cuando desee
        String seleccion = "";
        //Se crea un bucle que le pide al usuario Strings mientras no introduzca el caracter 's'
        do {
            System.out.println("Ingrese una raza de perro a guardar");
            razas.add(sn.nextLine());
            System.out.println("Ingrese 's' para salir o cualquier otro caracter para continuar ");
            seleccion = sn.nextLine();
        } while (!seleccion.equalsIgnoreCase("s"));
        System.out.println(razas);
        // Se instancia un objeto tipo iterator
        Iterator iterator = razas.iterator();
        // Se crea una bandera booleana
        boolean flag = false; 
        System.out.println("Ingrese una raza de perro a borrar de la lista");
        String perroABorrar = sn.nextLine();
        // Se crea un bucle while y dentro un condicional que cada vez que encuentre la
        // opción ingresada por el usuario en la lista procederá a borrarla y además
        // cambiará a true el valor de la bandera
        while (iterator.hasNext()) {
            if (iterator.next().equals(perroABorrar)) {
                iterator.remove();
                flag = true;
            }
        }
        //Se ordena la lista
        Collections.sort(razas);
        //Si la bandera está en false muestra un mensaje
        if (!flag) {
            System.out.println("El perro no está en la lista");
        }
        System.out.println(razas);

        sn.close();
    }
}
