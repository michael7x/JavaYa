/* Ej2: 
*Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados
*/
// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0

package capitulo11;
import java.util.Scanner;

public class SumaUltimosCinco {
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		int numero;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Por favor ingrese un número: ");
			numero = teclado.nextInt();
			
			if(i >= 5){
				suma = suma + numero;
			}
		}
		System.out.println("La suma de los últimos 5 números es igual a: " + suma);
		
	}

}
