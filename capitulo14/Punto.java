// Ejemplo
/*
*Desarrollar una clase que represente un punto en el plano y tenga los siguientes métodos: 
*cargar los valores de x e y, imprimir en que cuadrante se encuentra dicho punto 
*(primer cuadrante si x e y son positivas, si x<0 e y>0 segundo cuadrante, etc.)
*/
// link https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=14&codigo=87&inicio=0

package capitulo14;

import java.util.Scanner;

public class Punto {
	
	private Scanner teclado;
	int x, y;
	
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese la coordenada x: ");
		x = teclado.nextInt();
		System.out.print("Por favor ingrese la coordenad y: ");
		y = teclado.nextInt();
		
	}

	public void imprimirCuadrante(){
		if (x > 0 && y > 0){
			System.out.println("Usted se encuentra en el primer cuadrante");
		} else {
			if(x < 0 && y > 0 ){
				System.out.println("Usted se encuentra en el segundo cuadrante");
			} else {
				if(x < 0 && y < 0 ){
					System.out.println("Usted se encuentra en el tercer cuadrante");
				} else {
					System.out.println("Usted se encuentra en el cuarto cuadrante");
				}
			}
		}
	}
	
	public static void main(String[] arg){
		
		Punto punto1;
		punto1 = new Punto();
		punto1.inicializar();
		punto1.imprimirCuadrante();
	}
	
}
