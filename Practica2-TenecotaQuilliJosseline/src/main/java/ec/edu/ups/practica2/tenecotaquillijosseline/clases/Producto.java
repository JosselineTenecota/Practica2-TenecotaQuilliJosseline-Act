
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
                                                     //CLASE PADRE
//Nombre de la clase. Es padre de las clases hijas (Electronico,Ropa,Alimento).
public class Producto {
//Atributos.
    private String nombre;
    private int codigo;
    private double costo;
//Constructores.
    public Producto() {}
    public Producto(String nombre, int codigo, double costo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.costo = costo;
    }
//getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
//Metodo toString.
    @Override
    public String toString() {
        return "Producto{" + "nombre='" + nombre + '\'' + ", codigo=" + codigo + ", costo=" + costo + '}';
    }
}