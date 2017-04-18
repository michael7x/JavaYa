/*
 *Escribir un programa que solicite la carga de números por teclado, obtener su promedio. Finalizar la carga de valores cuando se cargue el valor 0.
 * 
 * https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=12&codigo=85&inicio=0
 */

package capitulo12;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile2 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int suma, cant, valor, promedio;
		suma = 0;
		cant = 0;
		
		do{
			System.out.print("Ingrese un valor. Si ingresa cero finalizará ");
			valor = teclado.nextInt();
			if(valor !=0){
				suma = suma + valor;
				cant++;
			}
		} while (valor != 0);
		
		if (cant != 0){
			promedio = suma/cant;
			System.out.println("El promedio de los valores ingresados es: " + promedio);
		} else {
			System.out.println("No se ingresaron valores");
		}

	}

}
