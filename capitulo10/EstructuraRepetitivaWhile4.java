// Ejemplo De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0

package capitulo10;
import java.util.Scanner;

public class EstructuraRepetitivaWhile4 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int x, cantidad, n;
		float largo;
		x = 1;
		cantidad = 0;
		
		System.out.print("¿Cuántas piezas procesará?: ");
		n = teclado.nextInt();
		while( x <= n){
			System.out.print("Ingrese la medida de la pieza: ");
			largo = teclado.nextFloat();
			if(largo >= 1.20 && largo <= 1.30){
				cantidad = cantidad + 1;
			}
			x = x + 1;
		}
		System.out.println("La catnidad de piezas aptas son: " + cantidad);
		
	}

}
