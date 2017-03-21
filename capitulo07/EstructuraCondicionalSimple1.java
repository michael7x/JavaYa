/* Ejemplo de: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=7&codigo=80&inicio=0 */

package capitulo07;
import java.util.Scanner;

public class EstructuraCondicionalSimple1 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		
		System.out.print("ingrese el sueldo: ");
		sueldo = teclado.nextFloat();
		
		if(sueldo > 3000){
			System.out.println("Esta Persona debe pagar impuestos");
		}
		
		
	}

}
