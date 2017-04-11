/* Ej6: 
Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar. 
*/

// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0

package capitulo11;
import java.util.Scanner;

public class Cuadrantes {

	public static void main(String[] args){
		
		int [] numbers = new int [] {1, 10, 12, 10, 22, 190, 4, 301, -1, 10, 10, 20};
		          int   contador = 0;
		  
		          for(int a=0;a<numbers.length;a++){
		  
		              if (numbers[a]==10) {
		                  contador ++;
		              }
		         }
		  
		          System.out.println ("&iuml;El numero 10 aparece :&iuml; + contador + &iuml; veces.&iuml;");
	
	}
}
