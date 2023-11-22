
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
//Nombre de la clase.
class Usuario {
//Atributo
    private String nombre;
    
//Constructores
    public Usuario(){}
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
//Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//Metodo toString.
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + '}';
    }    
}