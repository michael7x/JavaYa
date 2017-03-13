/*
*  Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
*
*	Nivel máximo:	Porcentaje>=90%.
*	Nivel medio:	Porcentaje>=75% y <90%.
*	Nivel regular:	Porcentaje>=50% y <75%.
*	Fuera de nivel:	Porcentaje<50%.
*
*	Link: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=8&codigo=81&inicio=0
*/

package capitulo08;
import java.util.Scanner;

public class PruebaDeNivel {
	
	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);
		double preguntastotales, preguntascorrectas;
		double promedio;
		
		System.out.print("Por favor ingrese la cantidad de preguntas del examen: ");
		preguntastotales = teclado.nextDouble();
		
		System.out.print("Por favor ingrese la cantidad de preguntas acertadas: ");
		preguntascorrectas = teclado.nextDouble();
	
		promedio = preguntascorrectas/preguntastotales;
		
		System.out.println("Su promedio es de " + promedio * 100 + "%");
		
		if(promedio>=0.9){
			System.out.println("Usted obtuvo el nivel máximo");
		} else {
			if(promedio >= 0.75){
				System.out.println("Usted obtuvo el nivel medio");
			} else {
				if(promedio >= 0.5){
					System.out.println("Usted obtuvo el nivel regular");
				} else {
					System.out.println("Usted está fuera de nivel");
				}
			}			
		}
	}
}
