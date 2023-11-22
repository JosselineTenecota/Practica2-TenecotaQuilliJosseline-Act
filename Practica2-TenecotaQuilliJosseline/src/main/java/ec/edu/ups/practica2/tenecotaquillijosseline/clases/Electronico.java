package ec.edu.ups.practica2.tenecotaquillijosseline.clases;

                                                 //CLASE HIJA 
//Nombre de la clase.
//Extends permite la relación de herencia entre la clase Electronico y Producto.
public class Electronico extends Producto {
//Atributo
    private String marca;
//Constructores.
    public Electronico(){}
    public Electronico(String nombre, int codigo, double costo, String marca) {
        super(nombre, codigo, costo);
        this.marca = marca;
    }
//Getter y seter.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Electronico{" + "nombre='" + getNombre() + '\'' + ", codigo=" + getCodigo() + ", costo=" + getCosto() + ", marca='" + marca + '\'' + '}';
    }
}
