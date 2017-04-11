/* Ej4: 
*Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
*Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36. 
*/
// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0


package capitulo11;

import java.util.Scanner;

public class TablaDeMultUnoADiez {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroingresado;

		System.out.print("Por favor ingrese un número del 1 a 10: ");
		numeroingresado = teclado.nextInt();

		if (numeroingresado >= 1 && numeroingresado <= 10) {

			for (int i = 0; i <= 12; i++) {
				System.out.println(numeroingresado * i);
			}
		} else {
			System.out.println("El número ingresado no está dentro del rango.");
		}

	}

}
