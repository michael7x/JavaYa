//Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez". 
//https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=9&codigo=82&inicio=0

package capitulo09;
import java.util.Scanner;

public class MenoresQueDiez {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Por favor ingrese el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Por favor ingrese el segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.print("Por favor ingrese el tercer número: ");
		num3 = teclado.nextInt();
		
		if(num1 < 10 && num2 < 10 && num3 < 10){
			System.out.println("Todos los números son menores que diez");
		} else {
			System.out.println("No todos los números son menores que diez");
		}
				
	}

}
