package servicio;

import entidad.Alumno;
import java.util.Scanner;
import java.util.ArrayList;

public class AlumnoService {

    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private Scanner sn = new Scanner(System.in);

    // Método que mediante un bucle crea un objeto Alumno. Pide toda la información
    // al usuario y ese Alumno se guarda en una lista de tipo Alumno y le pregunta
    // al usuario si quiere crear otro Alumno o no.
    public ArrayList<Alumno> crearAlumnos() {

        do {
            Alumno alumno = new Alumno();
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(sn.nextLine());
            System.out.println("Ingrese la nota 1 del alumno");
            notas.add(0, sn.nextInt());
            System.out.println("Ingrese la nota 2 del alumno");
            notas.add(1, sn.nextInt());
            System.out.println("Ingrese la nota 3 del alumno");
            notas.add(2, sn.nextInt());
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("Introduzca cualquier caracter para crear otro alumno o 's' para salir");
        } while (!sn.next().equals("s"));
        return alumnos;
    }

    // Método que le pide al usuario ingresar el nombre del alumno que quiere
    // calcular su nota final y luego lo busca en la lista de Alumnos. Si está en la
    // lista, usa la lista notas para calcular el promedio final de alumno.
    public double notaFinal() {
        System.out.println("Ingrese el nombre de alumno a calcular la nota final");
        String alumnom = sn.next();
        ArrayList<Integer> notas = new ArrayList<>();
        double prom = 0;
        double sum = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(alumnom)) {
                notas = alumno.getNotas();
            }
            sum = notas.stream().mapToInt(Integer::intValue).sum();
            prom = sum / 3;
        }
        return prom;
    }

}
