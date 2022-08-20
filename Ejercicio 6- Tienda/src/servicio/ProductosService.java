package servicio;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class ProductosService {
    private Scanner sn;
    private HashMap<String, Integer> productos;

    // Constructor
    public ProductosService() {
        this.sn = new Scanner(System.in);
        this.productos = new HashMap<>();
    }

    // Método que le pide por teclado al usuario un producto y su respectivo precio
    // para introducirlo al HashMap
    public void introducirUnProducto() {
        System.out.println("Ingrese el nombre del producto a almacenar");
        String key = sn.next();
        System.out.println("Ingrese el precio del producto a almacenar");
        int value = sn.nextInt();
        productos.put(key, value);
    }

    // Método que le pide al usuario por teclado el nombre de un producto para
    // modificar su precio, luego le solicita el nuevo precio del producto
    public void modificarPrecio() {
        System.out.println("Ingrese el producto a actualizar su precio");
        String producto = sn.next();
        System.out.println("Ingrese el nuevo precio del producto");
        int precio = sn.nextInt();
        productos.replace(producto, precio);

    }

    // Método que le solicita al usuario el nombre de un producto para luego
    // eliminarlo del HashMap
    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar");
        String producto = sn.next();
        productos.remove(producto);

    }

    // Método que muestra todos los productos almacenados en el HashMap con su
    // respectivo precio
    public void mostrarProductos() {
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("producto: " + entry.getKey() + ", precio: " + entry.getValue());
        }
    }

    // To String
    @Override
    public String toString() {
        return "ProductosService [productos=" + productos + "]";
    }

}
