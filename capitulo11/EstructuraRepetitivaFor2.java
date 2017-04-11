/*
 * Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores ingresados y su promedio.
 * Este problema ya lo desarrollamos , lo resolveremos empleando la estructura for.
 */

// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0

package capitulo11;
import java.util.Scanner;

public class EstructuraRepetitivaFor2 {
	
	public static void main(String[] arg){
		Scanner teclado = new Scanner(System.in);
		int suma, f, valor;
		float promedio;
		
		suma = 0;
		
		for(f = 1; f <= 10; f++){
			System.out.print("Ingrese Valor: ");
			valor = teclado.nextInt();
			suma += valor;
		}
		System.out.print("La suma es: ");
		System.out.println(suma);
		promedio = suma / 10;
		System.out.print("El promedio es: ");
		System.out.print(promedio);
		
	}

}
