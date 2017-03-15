// Ejemplo De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0

package capitulo10;
import java.util.Scanner;

public class EstructuraRepetitivaWhile3 {
	
	public static void main(String[] arg){
		
		Scanner teclado = new Scanner(System.in);
		int x, valor; 
		double promedio, suma;
		
		x = 1;
		suma = 0;
		
		while(x <= 10){
			System.out.print("Por favor ingrese un valor: ");
			valor = teclado.nextInt();
			suma = suma + valor;
			x = x + 1;
		}
		promedio = suma / 10;
		System.out.println("La sma de los 10 valores es: " + suma);
		System.out.println("El promedio es: " + promedio);
	}

}
