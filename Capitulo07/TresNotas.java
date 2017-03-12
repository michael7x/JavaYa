package capitulo07;
import java.util.Scanner;

public class TresNotas {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3;
		double promedio;
		
		System.out.print("Por favor, ingrese la nota 1: ");
		nota1 = teclado.nextDouble();
		
		System.out.print("Por favor, ingrese la nota 2: ");
		nota2 = teclado.nextDouble();
		
		System.out.print("Por favor, ingrese la nota 3: ");
		nota3 = teclado.nextDouble();
		
		promedio = (nota1 + nota2 + nota3)/3;
		
		if(promedio >= 7){
			System.out.println("Usted está promocionado");
		} else {
			System.out.println("Siga participando: ¡A final!");
		}
	}

}
