/* Ejercicio 2 de https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=6&codigo=79&inicio=0 */

package scriptsJava;
import java.util.Scanner;

public class CuatroNumeros {
	
	public static void main(String[] arg){
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3, num4, suma, producto;
		
		System.out.print("Ingrese el primer valor, que será sumado: ");
		num1 = teclado.nextInt();
				
		System.out.print("Ingrese el segundo valor, que será sumado: ");
		num2 = teclado.nextInt();
		
		System.out.print("Ingrese el primer valor, que será multiplicado: ");
		num3 = teclado.nextInt();
		
		System.out.print("Ingrese el primer valor, que será multiplicado: ");
		num4 = teclado.nextInt();
		
		suma = num1 + num2;
		producto = num3 * num4;
		
		System.out.print("La suma de los dos números es ");
		System.out.println(suma);
		
		System.out.print("El producto los otros números es ");
		System.out.println(producto);
		
	}

}
