package capitulo07;
import java.util.Scanner;

public class UnoODosDigitos {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.print("Por favor ingrese un numero: ");
		numero = teclado.nextInt();
		
		if(numero < 10){
			System.out.println("El número tiene 1 dígito");
		} else {
			System.out.println("El numero tiene 2 digitos");
		}
		
	}

}
