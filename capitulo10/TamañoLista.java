/* 
*Realizar un programa que permita cargar dos listas de 15 valores cada una. 
*Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo. 
*
*/
//De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0

package capitulo10;
import java.util.Scanner;

public class TamañoLista {
	
	public static void main(String arg[]){
		Scanner teclado = new Scanner(System.in);
		int listauno = 0;
		int listados = 0;
		int nuno = 1;
		int ndos = 1;
		
		System.out.println("Por favor ingrese valores para la priemera lista");
		while(nuno <= 15){
			System.out.print("El valor " +nuno+ " será: ");
			listauno += teclado.nextInt();
			nuno++;
		}
		
		System.out.println("Por favor ingrese valores para la segunda lista");
		while(ndos <= 15){
			System.out.print("El valor " +ndos+ " será: ");
			listados += teclado.nextInt();
			ndos++;
		}
		
		if(listauno > listados){
			System.out.println("La primera lista es mayor");
		} else {
			if(listauno < listados){
				System.out.println("La segunda lista es mayor");
			} else {
				System.out.println("Son listas iguales");
			}
		}
	}
}
