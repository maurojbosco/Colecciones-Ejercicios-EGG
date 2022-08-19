package entidad;

import java.util.HashMap;

public class Productos {
    // Atributos
    HashMap<String, Integer> productosyprecio;
    // Constructores

    public Productos() {
    }

    public Productos(HashMap<String, Integer> productosyprecio) {
        this.productosyprecio = productosyprecio;
    }

    // Getters y Setters
    public HashMap<String, Integer> getProductosyprecio() {
        return productosyprecio;
    }

    public void setProductosyprecio(HashMap<String, Integer> productosyprecio) {
        this.productosyprecio = productosyprecio;
    }
    // To String

    @Override
    public String toString() {
        return "Productos [productosyprecio=" + productosyprecio + "]";
    }
    
}
