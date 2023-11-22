
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
                                              //CLASE HIJA 
//Nombre de la clase.
//Extends permite la relación de herencia entre la clase Alimento y Producto.
public class Alimento extends Producto {
//Atributo
    private String fechaCaducidad;
//Constructores.
    public Alimento(){}
    public Alimento(String nombre, int codigo, double costo, String fechaCaducidad) {
        super(nombre, codigo, costo);
        this.fechaCaducidad = fechaCaducidad;
    }
//Getter y setter.
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
//Metodo toString.
    @Override
    public String toString() {
        return "Alimentos{" + "nombre='" + getNombre() + '\'' + ", codigo=" + getCodigo() + ", costo=" + getCosto() + ", fechaCaducidad='" + fechaCaducidad + '\'' + '}';
    }
}
