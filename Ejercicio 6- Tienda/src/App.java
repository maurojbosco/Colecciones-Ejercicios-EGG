
/*/Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas. */
import servicio.ProductosService;
import java.util.Scanner;

public class App {

    public static Scanner sn = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        ProductosService proser = new ProductosService();
        int opcion;
        do {
            System.out.println("Ingrese una opciíon:");
            System.out.println("1. Introducir un nuevo producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar todos los productos con su precio");
            System.out.println("5. Salir");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    proser.introducirUnProducto();
                    break;
                case 2:
                    proser.modificarPrecio();
                    break;
                case 3:
                    proser.eliminarProducto();
                    break;
                case 4:
                    proser.mostrarProductos();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}
