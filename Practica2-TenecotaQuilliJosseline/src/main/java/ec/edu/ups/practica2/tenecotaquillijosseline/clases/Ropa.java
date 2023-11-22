
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;

                                                       //CLASE HIJA 
//Nombre de la clase.
//Extends permite la relación de herencia entre la clase Ropa y Producto.
public class Ropa extends Producto {
//Atributo.
    private String tipo;
//Constructores.
    public Ropa(){}
    public Ropa(String nombre, int codigo, double costo, String tipo) {
        super(nombre, codigo, costo);
        this.tipo = tipo;
    }
//Getter y setter.
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//Metodo toString.
    @Override
    public String toString() {
        return "Ropa{" + "nombre='" + getNombre() + '\'' + ", codigo=" + getCodigo() + ", costo=" + getCosto() + ", tipo='" + tipo + '\'' + '}';
    }
}

