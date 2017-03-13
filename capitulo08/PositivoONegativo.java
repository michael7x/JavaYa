/*Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo. 
 * Link https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=8&codigo=81&inicio=0 
 * */

package capitulo08;
import java.util.Scanner;

public class PositivoONegativo {
	
	public static void main(String[] arg){
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Por favor ingrese el numero: ");
		num = teclado.nextInt();
		
		if(num>0){
			System.out.println("El número es positivo");
		} else{
			if(num<0){
				System.out.println("El número es negativo");
			} else {
				System.out.println("El número es neutro");
			}
		}
	}
}
