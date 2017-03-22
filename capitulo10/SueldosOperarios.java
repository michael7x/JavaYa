/*
*En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, 
*realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
*Además el programa deberá informar el importe que gasta la empresa en sueldos al personal. 
*/
//De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0

package capitulo10;
import java.util.Scanner;

public class SueldosOperarios {
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int cantidaddeempleados, contador = 0, mastrescientos = 0, entretresycientos = 0;
		float sueldo;
		float gastoensueldo = 0;
		
		
	System.out.print("Por Favor ingrese la cantidad de empleados: ");
	cantidaddeempleados = teclado.nextInt();
	
	while(contador < cantidaddeempleados){
		System.out.print("Por Favor ingrese el sueldo del empleado: ");
		sueldo = teclado.nextFloat();
		gastoensueldo += sueldo;
		
		if(sueldo > 100 && sueldo < 300){
			entretresycientos++;
		} else{
			if(sueldo > 300){
				mastrescientos += 1;
			} else{
				System.out.println("Ningún sueldo puede ser menor de 100");
			}
		}
		contador++;
	}
		System.out.println("--------------------------------------");
		System.out.println("La cantidad de gente que cobra más de tresciententos es: "+ mastrescientos);
		System.out.println("La cantidad de gente que cobra entre trescientos y quinientos es: "+ entretresycientos);
		System.out.println("El total de gastos en sueldo es igual a: " + gastoensueldo);
	}

}
