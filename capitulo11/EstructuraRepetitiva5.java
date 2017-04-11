/*
*Escribir un programa que lea n números enteros y calcule la cantidad de valores mayores o iguales a 1000.
*/
// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0

package capitulo11;
import java.util.Scanner;

public class EstructuraRepetitiva5 {
	
	public static void main(String[] arg){
		Scanner teclado = new Scanner(System.in);
		int cantidad, n, f, valor;
		
		cantidad = 0;
		n = 0;
		f = 0;
		valor = 0;
		
		System.out.print ("Cuantos valores ingresará: ");
		n = teclado.nextInt();
		
		for(f=1; f<= n; f++){
			System.out.print("Ingrese el valor: ");
			valor = teclado.nextInt();
			if (valor >= 1000){
				cantidad += 1;
			}
			
		}
		System.out.println("La cantidad de valores ingresados mayores o iguales a 1000 es: " + cantidad);
	}
	
}
