/*
 * Escribir un programa que lea 10 números enteros y luego muestre cuántos valores ingresados fueron múltiplos de 3 y cuántos de 5. 
 * Debemos tener en cuenta que hay números que son múltiplos de 3 y de 5 a la vez.
 */

// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0

package capitulo11;
import java.util.Scanner;

public class EstructuraRepetitivaFor4 {
	
	public static void main(String[] arg){
		Scanner teclado = new Scanner(System.in);
		int mul3, mul5, valor, f;
		
		valor = 0;
		mul3 = 0;
		mul5 = 0;
		
		for(f=1;f<=10;f++){
			System.out.print("Por favor ingrese un valor: ");
			valor = teclado.nextInt();
			if(valor% 3 == 0){
				mul3 += 1;
			}
			if(valor%5 == 0){
				mul5 += 1;
			}
		}
		
		System.out.println("Los múltiplos de 3 son " + mul3);
		System.out.println("Los múltiplos de 5 son " + mul3);
		
	}
}
