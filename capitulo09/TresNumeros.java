//Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a este resultado se lo multiplica por el tercero. 
//https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=9&codigo=82&inicio=0

package capitulo09;
import java.util.Scanner;

public class TresNumeros {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Ingrese el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Ingrese el segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.print("Ingrese el  tercer número: ");
		num3 = teclado.nextInt();
		
		if(num1 == num2 && num2 == num3){
			System.out.println("La suma del primero por el segundo es igual a " + (num1 + num2));
			System.out.println("Si a eso le multiplicamos el tercero queda " + (num1 + num2) * num3);
		}
		
	}

}
