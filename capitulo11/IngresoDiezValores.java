/*
 * Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
a) La cantidad de valores ingresados negativos.
b) La cantidad de valores ingresados positivos.
c) La cantidad de múltiplos de 15.
d) El valor acumulado de los números ingresados que son pares. 
 *
 */

package capitulo11;
import java.util.Scanner;

public class IngresoDiezValores {
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int valoringresado = 0;
		int numerosnegativos = 0;
		int numerospositivos = 0;
		int multiplosdequince = 0;
		int numerospares = 0;
		
		System.out.println("Usted tendrá que ingresar 10 números");
		System.out.println("");
		
		for(int i = 1; i <= 10; i++){
			System.out.print("Por Favor ingrese el numero " + i + " : ");
			valoringresado = teclado.nextInt();
			
			if(valoringresado > 0){
				numerospositivos++;
			} else {
				if(valoringresado < 0){
					numerosnegativos++;
				}
			}
			
			if(valoringresado % 15 == 0 ){
				multiplosdequince++;
			}
			
			if(valoringresado % 2 == 0){
				numerospares++;} 
			}
		System.out.println("La cantidad de números positivos fueron: " + numerospositivos);
		System.out.println("La cantidad de números negativos fueron: " + numerosnegativos);
		System.out.println("La cantidad de números múltiplos de 15 fueron: " + multiplosdequince);
		System.out.println("La cantidad de números numeros pares fueron: " + numerospares);	
		
	}
}

		
