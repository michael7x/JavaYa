// Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad. 
// https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=9&codigo=82&inicio=0

package capitulo09;
import java.util.Scanner;


public class CorrespondeNavidad {
	
	public static void main(String[] arg){
		
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anio;
		
		System.out.print("Por favor ingrese el día: ");
		dia = teclado.nextInt();
		
		System.out.print("Por favor ingrese el mes: ");
		mes = teclado.nextInt();
		
		System.out.print("Por favor ingrese el anio: ");
		anio = teclado.nextInt();
		
		if(dia == 25 && mes == 12){
			System.out.println("Este dia es navidad. ¡Feliz navidad!");
		} else {
			System.out.println("Este día no es navidad. ¡Qué tengas un buen día!");
		}
	}

}
