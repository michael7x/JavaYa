//Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos) 
// De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=9&codigo=82&inicio=0

package capitulo09;
import java.util.Scanner;

public class RangoDeVariacion {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Por favor ingrese el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Por favor ingrese el segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.print("Por favor ingrese el tercer número: ");
		num3 = teclado.nextInt();
		
		if(num1 < num2 && num1 <num3){
			System.out.println(num1);
		} else {
			if(num2 < num3){
				System.out.println(num2);
			} else{
				System.out.println(num3);
			}
		}
		System.out.println("-------");
		if(num1 > num2 && num1 > num3){
			System.out.println(num1);
		} else {
			if (num2 > num3){
				System.out.print(num2);
			} else{
				System.out.println(num3);
			}
		}

	}

}
