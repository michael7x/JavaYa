/* Ejercicio 1 de https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=6&codigo=79&inicio=0 */

package scriptsJava;
import java.util.Scanner;

public class PerimetroCuadrado {
	
	public static void main(String[] ar){
		
		Scanner teclado = new Scanner(System.in);
		int lado, perimetro;
		
		System.out.print("Ingrese el tamaño de lado del cuadrado: ");
		lado = teclado.nextInt();
		
		perimetro = 4*lado;
		
		System.out.print("El perimetro de su cuadrado es de ");
		System.out.print(perimetro);
	
	}
	
}
