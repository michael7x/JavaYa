/* Ej1: 
*Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:
*a) De cada triángulo la medida de su base, su altura y su superficie.
*b) La cantidad de triángulos cuya superficie es mayor a 12. 
*/
// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0

package capitulo11;
import java.util.Scanner;

public class SuperficieTriangulo {
	
	public static void main(String[] arg){
		Scanner teclado = new Scanner(System.in);
		float base, altura, superficie;
		int cantidaddetriangulos;
		int mayorquedoce = 0;
		
		System.out.println("¿Cuántos triángulos deseas medir?");
		cantidaddetriangulos = teclado.nextInt();
		
		for(int i = 0; i <= cantidaddetriangulos; i++){
			System.out.print("Por favor ingrese el valor de la base: ");
			base = teclado.nextFloat();
			System.out.print("Por favor ingrese el valor de la altura: ");
			altura = teclado.nextFloat();
			
			superficie = (base*altura)/2;
			System.out.println("La superficie del triángulo es: " + superficie);
			
			if (superficie > 12){
				mayorquedoce += 1; 
			}
			
		}
		System.out.println("La cantidad de triángulos con área mayores que 12 es: " + mayorquedoce);
		
	}
}
