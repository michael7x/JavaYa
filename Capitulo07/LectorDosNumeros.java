/*Realizar un programa que lea por teclado dos números, 
 * si el primero es mayor al segundo informar su suma y diferencia, 
 * en caso contrario informar el producto y la división del primero respecto al segundo.*/

/* https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=7&codigo=80&inicio=0 */

package capitulo07;
import java.util.Scanner;

public class LectorDosNumeros {
	
	public static void main(String[] arg){
		
		Scanner teclado = new Scanner(System.in);
		double num1, num2, suma, promedio;
		
		System.out.print("Por favor ingrese el primer numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Por favor ingrese el segundo número: ");
		num2 = teclado.nextInt();
		
		suma = num1 + num2;
		promedio = (num1 + num2)/2;
		
		if(num1>num2){
			System.out.println(suma);
		} else {
			System.out.println(promedio);
		}
		
		
		
	}

}
