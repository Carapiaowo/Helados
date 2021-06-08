
package Model;

import java.io.InputStream;

/**
 *
 * @author CarapiaOwO
 */
public class Product {
    
    String descripcion, nombre;
    int stock, id;
    double precio;
    InputStream foto;

    public Product() {
    }

    public Product(String descripcion, String nombre, int stock, int id, double precio, InputStream foto) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.stock = stock;
        this.id = id;
        this.precio = precio;
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }
    
    
    
}
