/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. */

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
        sn.close();
    }
}
