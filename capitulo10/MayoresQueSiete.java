// Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores. 
// De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0

package capitulo10;
import java.util.Scanner;

public class MayoresQueSiete {
	
	public static void main(String[] arg){
		
		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		int nota = 0;
		int mayoroigual = 0;
		int menor = 0;
		

		
		while(contador < 10){
			
			System.out.print("Por favor ingrese una nota: ");
			nota = teclado.nextInt();
			
			if(nota >= 7){
				mayoroigual ++; 
			} else {
				menor ++;
			}
			
			contador++;
		}
		System.out.println("Usted tiene " +mayoroigual+ " notas mayor o igual que siete; y " +menor + " menores");
	}

}
