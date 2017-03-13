/*Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos. 
 * De https://www.tutorialesprogramacionya.com/javaya/index.php?inicio=0 */

package capitulo08;
import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] arg){
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Por favor ingrese el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Por favor ingrese el segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.print("Por favor ingrese el tercer número: ");
		num3 = teclado.nextInt();
		
		if(num1 > num2){
			if(num1 > num3){
				System.out.print("El primer número es el mayor");
			} else {
				System.out.print("En tercer número es el mayor");
			}
		} else{
			if(num2 > num3){
				System.out.print("El segundo numero es el mayor");
			} else{
				System.out.print("El tercer numero es el mayor");
			}
		}		
	}

}
