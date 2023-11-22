
package ec.edu.ups.practica2.tenecotaquillijosseline.clases;
//Importar la clase Scanner. 
import java.util.Scanner;

//FORMA DE USAR EL SISTEMA.
/**El usuario ingresa el nombre de la persona que va a realizar la compra de algún producto.
 * Tiene opcion a escoger cualquier producto y posterior a eso se registra un código de referencia 
 * y el costo. 
 * Finalmente concluye con una factura o comprobante de compra y da a conocer el producto que adquirió.
 */

public class PrincipalSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Permite ingresar el nombre del usuario o comprador.
        System.out.print("Nombre del usuario o comprador: ");
        String nombreUsuario = scanner.nextLine();
//A través de la clase main llamo a las demas clases para que cada una cumpla la funcion que tiene. 
        Usuario u = new Usuario(nombreUsuario);
        Carrito carro = new Carrito();
        MostrarPantalla pantalla = new MostrarPantalla();
        Controlar controla = new Controlar(u, carro, pantalla);
//Permite iniciar todo el sistema de compra.
        controla.Sistema(scanner);
    }    
}