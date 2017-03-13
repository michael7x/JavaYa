/*Ejemplo de https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=8&codigo=81&inicio=0*/

package capitulo08;
import java.util.Scanner;

public class EstructuraCondicionalAnidada1 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int nota1, nota2, nota3;
		
		System.out.print("Ingrese la primer nota: ");
		nota1 = teclado.nextInt();
		
		System.out.print("Ingrese la segunda nota: ");
		nota2 = teclado.nextInt();
		
		System.out.print("Ingrese la tercera nota: ");
		nota3 = teclado.nextInt();
		
		int promedio = (nota1 + nota2 + nota3)/3;
		
		if (promedio >= 7){
			System.out.println("Promocionado");
		} else {
			if(promedio >= 4){
				System.out.println("Regular");
			} else{
				System.out.println("Reprobado");
			}
		}
		
	} 

}
