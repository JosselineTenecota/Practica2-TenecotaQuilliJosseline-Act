
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
//Importar lista.
import java.util.List;
//Importar la clase Scanner; 
import java.util.Scanner;

//Nombre de la clase. Aqui permite digitar todo lo que va a visualizarse en pantalla tras realizar la ejecución.
public class MostrarPantalla {
//Menu de opciones a escoger.
    public void MenuDeOpciones() {
        System.out.println(".....OPCIONES.....");
        System.out.println("1. Añadir producto para la compra.");
        System.out.println("2. Realizar la compra.");
        System.out.println("3. Finalizar el pedido.");
        System.out.print("Escoja la opción que desea: ");
    }
//Permite escoger la opcion solicitada por el usuario.
    public int Opcion(Scanner scanner) {
        return scanner.nextInt();
    }
//Permite escoger el producto en base a lo que requiera.
    public String tipo(Scanner scanner) {
        System.out.print("Ingrese el tipo de producto (Electronico, Ropa, Alimento): ");
        return scanner.next();
    }

    public String nombre(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        return scanner.next();
    }

    public int codigo(Scanner scanner) {
        System.out.print("Ingrese el código del producto: ");
        return scanner.nextInt();
    }

    public double costo(Scanner scanner) {
        System.out.print("Ingrese el costo del producto: ");
        return scanner.nextDouble();
    }
//Permite mostrar el total de la compra realizada.
    public void totalCompra(double total) {
        System.out.println("Total del pedido: $" + total);
    }
//Permite mostrar una factura de los productos comprados.
    public void factura(List<Producto> productos) {
        System.out.println("Factura de la compra realizada: ");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
//Permite mostrar un mensaje de despedida al finalizar el pedido.
    public void mensajeFinal() {
        System.out.println("¡Compra finalizada con éxito!");
    }
}