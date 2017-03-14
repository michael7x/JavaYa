// Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
//Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.) 
// De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=9&codigo=82&inicio=0

package capitulo09;
import java.util.Scanner;

public class PosciónCartesiana {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int x, y;
		
		System.out.print("Por favor ingrese el valor de la coordenada x: ");
		x = teclado.nextInt();
		
		System.out.print("Por favor ingrese el valor de la corrdenada y: ");
		y = teclado.nextInt();
		
		if(x > 0 && y > 0){
			System.out.println("Usted se ecuentra en el primer cuadrante");
		} else {
			if(x < 0 && y > 0){
				System.out.println("Usted se encuentra en el segundo cuadrante");
			} else{
				if(x < 0 && y < 0){
					System.out.println("Usted está en el tercer cuadrante");
				} else {
					System.out.println("Usted está en el cuarto cuadrante");
				}
			}
		}
	} 

}
