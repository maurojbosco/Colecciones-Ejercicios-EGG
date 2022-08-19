/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main. */

import servicio.AlumnoService;

public class App {
    public static void main(String[] args) {
        // Se intancia un objeto servicio para poder llamar a sus métodos
        AlumnoService alser = new AlumnoService();
        // Se llama al método que crea Alumnos y los guarda en un ArrayList
        alser.crearAlumnos();
        // se llama al método que calcula la nota final. A continuación se evalúa si la
        // nota final es igual a 0.0, de ser así el alumno buscado no está en la lista
        // y se informa por pantalla. En cualquier otro caso el alumno si está en la
        // lista y se muestra la nota por pantalla
        double notafinal = alser.notaFinal();
        if (notafinal == 0.0) {
            System.out.println("El alumno ingresado no se encuentra en la lista");
        } else {
            System.out.println("La nota final del alumno es: " + notafinal);
        }

    }
}
