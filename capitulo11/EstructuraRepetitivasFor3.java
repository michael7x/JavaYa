/*
 * Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */

// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0

package capitulo11;
import java.util.Scanner;


public class EstructuraRepetitivasFor3 {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int aprobados, reprobados, f, nota;

		
		aprobados = 0;
		reprobados = 0;
		
		for(f = 1; f<=10; f++){
			System.out.print("Ingrese la nota: ");
			nota = teclado.nextInt();
			if (nota >= 7){
				aprobados = aprobados + 1;
			}else{
				reprobados = reprobados + 1;
			}
		}
		System.out.println("Cantidad de aprobados: " + aprobados);
		System.out.println("Cantidad de reprobados: " + reprobados);
		
	}
	
}
