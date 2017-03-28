/**
5 - Errores sintácticos y lógicos 
https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=5&codigo=78&inicio=0
**/

package scriptsJava;
import java.util.Scanner;

public class SuperficieCuadrado {
	
	public static void main(String[] ar){
		
		Scanner teclado = new Scanner(System.in);
		
		int lado;
		int superficie;
		
		System.out.print("Ingrese el valor del lado del cuadrado: ");
		lado = teclado.nextInt();
		
		superficie = lado * lado;
		
		System.out.print("La superficie del cuadrado es: ");
		System.out.print(superficie);
				
	}

}
