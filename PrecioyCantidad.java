/*Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. 
 * Mostrar lo que debe abonar el comprador.  
 de https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=6&codigo=79&inicio=0
 */
import java.util.Scanner;

public class PrecioyCantidad {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int articulos;
		double precio, montototal;
		
		System.out.print("Por favor ingrese la cantidad de artículos que lleva: ");
		articulos = teclado.nextInt();
		
		System.out.print("Por favor ingrese el precio de los precio que lleva: ");
		precio = teclado.nextDouble();
		
		montototal = articulos * precio;
		
		System.out.print("El monto total por llevarse " + articulos + " articulos a " + precio + " pesos es de: " + montototal);
		
	}
	

}
