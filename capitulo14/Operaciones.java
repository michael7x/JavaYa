// Ejercicio 2
/*
*Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular su suma, resta, multiplicación y división, cada una en un método, imprimir dichos resultados. 
*/
// link https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=14&codigo=87&inicio=0


package capitulo14;
import java.util.Scanner;

public class Operaciones {
	private Scanner teclado;
	private float num1, num2;
	
	public void inicializar(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese el número 1: ");
		num1 = teclado.nextFloat();
		System.out.print("Por favor ingrese el número 2: ");
		num2 = teclado.nextFloat();
		
	}

	public void suma(){
		float suma;
		suma = num1 + num2;
		System.out.println("La suma es " + suma);
	}
	
	public void resta(){
		float resta;
		resta = num1 - num2;
		System.out.println("La resta es " + resta);
	}
	
	public void multiplicacion(){
		float mult;
		mult = num1 * num2;
		System.out.println("La multiplicacion es " + mult);
	}
	
	public void division(){
		float div;
		div = num1 / num2;
		System.out.println("La division es " + div);
	}
 
	
	public static void main(String[] ar){
		Operaciones operaciones1;
		operaciones1 = new Operaciones();
		operaciones1.inicializar();
		operaciones1.suma();
		operaciones1.resta();
		operaciones1.multiplicacion();
		operaciones1.division();

	}
}
