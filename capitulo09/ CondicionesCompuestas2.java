//Ejemplo de https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=9&codigo=82&inicio=0

package capitulo09;
import java.util.Scanner;

public class CondicionesCompuestas2 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anio;
		
		System.out.print("Ingrese nro de día: ");
		dia = teclado.nextInt();
		
		System.out.print("Ingrese nro de mes: ");
		mes = teclado.nextInt();
		
		System.out.print("Ingrese nro de anio: ");
		anio = teclado.nextInt();
		
		if (mes == 1 || mes == 2 || mes == 3){
			System.out.println("Corresponde al primer trimestre");
		}
	}
	
}
