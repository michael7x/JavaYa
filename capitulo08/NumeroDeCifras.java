/*Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor. 
 * Link : https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=8&codigo=81&inicio=0 */

package capitulo08;
import java.util.Scanner;

public class NumeroDeCifras {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Por favor ingrese un número: ");
		num = teclado.nextInt();
		
		if(num < 0 || num > 999){
			System.out.println("Disculpa. El número está fuera del rango. Ingresa un número positivo de una a tres cifras");			
		} else {
			if(num<10){
				System.out.println("El número contiene un dígito");
			} else{
				if(num<100){
					System.out.println("El número cotiene dos dígitos");
				} else {
					System.out.println("El número contien tres digitos");
				}
			}
		}
		
	}

}
