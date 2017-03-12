/* Ejemplo de: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=7&codigo=80&inicio=0 */

package capitulo07;

import java.util.Scanner;

public class EstructuraCondicionalCompuesta1 {
	
	public static void main(String[] ar){
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Ingrese el primer valor: ");
		num1 = teclado.nextInt();
		
		System.out.print("Ingrese el segundo valor: ");
		num2 = teclado.nextInt();
		
		if(num1 > num2){
			System.out.print(num1);
		} else {
			System.out.print(num2);
		}
		
		
	}

}
