// Ejemplo De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0

package capitulo10;
import java.util.Scanner;

public class EstructuraRepetitivaWhile2 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int n, x;
		
		System.out.print("Por favor, ingrese el valor final: ");
		n = teclado.nextInt();
		
		x = 1;
		
		while(x <= n){
			System.out.print(x);
			System.out.print(" - ");
			x = x + 1; 
		}
		
	}

}
