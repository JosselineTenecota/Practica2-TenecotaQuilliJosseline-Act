
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;

//importar lista.
import java.util.List;
//importar clase Scanner.
import java.util.Scanner;
//Nombre de la clase.
public class Controlar {
    private Usuario usuario;
    private Carrito carro;
    private MostrarPantalla mostrar;
//Constructores.
    public Controlar(){}
    public Controlar(Usuario usuario, Carrito carro, MostrarPantalla mostrar) {
        this.usuario = usuario;
        this.carro = carro;
        this.mostrar = mostrar;
    }
//Permite iniciar con el sistema de la compra.
    public void Sistema(Scanner scanner) {
        int opcion;
        mostrar.MenuDeOpciones();
        //El do-while permite ejecutar mientras la opcion sea diferente de 3.
        do {
            opcion = mostrar.Opcion(scanner);
            switch (opcion) {
                // Agrega los productos al seleccionar la opción 1.
                case 1:
                    agregarProducto(scanner);
                    break;
                // Realiza la compra al seleccionar la opcion 2. 
                case 2:
                    realizarCompra();
                    break;
                // Mostrar mensaje final al seleccionar la opción 3
                case 3:
                    mostrar.mensajeFinal(); 
                    break;
            }
            //Muestra el menú de opciones cuando no se elige la opción 3.
            if (opcion != 3) {
                mostrar.MenuDeOpciones();
            }
            
            } while (opcion != 3);

        // Se muestra la factura y el total de la compra.
            if (opcion == 2) {
                System.out.println("Resumen de la compra:");
                mostrar.factura(carro.getProductos());
                mostrar.totalCompra(TotalCompra(carro));
            }
    }
//Permite agregar el producto al carrito de compras.
    public void agregarProducto(Scanner scanner) {
        String tipo = mostrar.tipo(scanner);
        String nombre = mostrar.nombre(scanner);
        int codigo = mostrar.codigo(scanner);
        double costo = mostrar.costo(scanner);

        Producto producto;
        switch (tipo.toLowerCase()) {//convierte en minúsculas el contenido de la variable.
            case "electronico":
                System.out.print("¿Cuál es la marca del producto electrónico?: ");
                String marcaElectronico = scanner.next();
                producto = new Electronico(nombre, codigo, costo, marcaElectronico);
                break;
            case "ropa":
                System.out.print("¿Qué tipo de material desea para la ropa?: ");
                String materialRopa = scanner.next();
                producto = new Ropa(nombre, codigo, costo, materialRopa);
                break;
            case "alimentos":
                System.out.print("¿Cuál es la fecha de caducidad del alimento?: ");
                String fechaCaducidad = scanner.next();
                producto = new Alimento(nombre, codigo, costo, fechaCaducidad);
                break;
            default:
                producto = new Producto(nombre, codigo, costo);
                break;
        }

        carro.agregarProducto(producto);
    }
//Permite realizar la compra de los productos.
    public void realizarCompra() {
    mostrarResumenCompra();
   }

   public void mostrarResumenCompra() {
    List<Producto> productosEnCarro = carro.getProductos();
    if (!productosEnCarro.isEmpty()) {
        mostrar.factura(productosEnCarro);
        mostrar.totalCompra(TotalCompra(carro));
    }
    }

    public double TotalCompra(Carrito carro) {
    double total = 0.0;
    List<Producto> productosEnCarro = carro.getProductos();

    for (Producto producto : productosEnCarro) {
        total += producto.getCosto();
    }
    return total;
    }
}