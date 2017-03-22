/* 
*
*Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.
*
*/
//De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0


package capitulo10;
import java.util.Scanner;

public class ParesEImpares {
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int cantidaddenumeros, numero;
		int espar = 0;
		int esimpar = 0;
		int n = 1;
		
		System.out.println("¿Cuántos números ingresará? ");
		cantidaddenumeros = teclado.nextInt();
		
		while(n <= cantidaddenumeros){
			System.out.print("Ingresese el " +n+ " numero: ");
			numero = teclado.nextInt();
			if(numero % 2 == 0){
				espar++;
			} else {
				if(numero % 2 != 0){
					esimpar++; 
				} else {
					System.out.println("Estás mandndo fruta. ¡Venga hombre!");
				}
			}
			n++;
		}
		
		System.out.println("La cantidad de números pares fueron: " + espar);
		System.out.println("La cantidad de números impares fueron: " + esimpar);
	}
}
