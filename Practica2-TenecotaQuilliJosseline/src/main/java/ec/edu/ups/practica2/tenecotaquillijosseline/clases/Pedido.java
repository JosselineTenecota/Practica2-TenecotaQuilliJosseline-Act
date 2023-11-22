package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
//Importar la lista.
import java.util.List; 

//Nombre de la clase.
class Pedido {
//Atributo. Agregamos una lista.
    private List<Producto> productos;
//Constructor.
    public Pedido(List<Producto> productos) {
        this.productos = productos;
    }
//Getter y setter
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
//Metodo toString.
    @Override
    public String toString() {
        return "Pedido{" + "productos=" + productos + '}';
    }
//Calcular el valor total de los productos.
    public double calcularTotal() {
    double total = 0.0;
    for (int i = 0; i < productos.size(); i++) {
        Producto producto = productos.get(i);
        total += producto.getCosto();
    }
    return total;
}
}