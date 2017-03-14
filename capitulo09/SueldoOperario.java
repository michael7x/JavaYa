/*
De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios. 
*/

// De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=9&codigo=82&inicio=0

package capitulo09;
import java.util.Scanner;

public class SueldoOperario {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int sueldo, antiguedad;
		
		System.out.print("Por favor ingrese el sueldo: ");
		sueldo = teclado.nextInt();
		
		System.out.print("Por favor ingrese los años de antiguedad: ");
		antiguedad = teclado.nextInt();
		
		if(sueldo < 500 && antiguedad >= 10){
			System.out.println("Usted tendrá un aumento del 20%. Por lo tanto su sueldo será de " + ((sueldo * 0.2) + sueldo));
		} else {
			if(sueldo < 500 && antiguedad < 10){
				System.out.println("Usted tendrá un aumento del 5%. Por lo tanto su sueldo será de " + ((sueldo * 0.05) + sueldo));
				} else {
					System.out.println("Su sueldo es de " + sueldo);
					} 
				}		
	}
}
