/*Se desea guardar los sueldos de 5 operarios en un vector. Realizar la creación y carga del vector en el constructor.*/

package capitulo26;

import java.util.Scanner;

public class Operarios {
	private Scanner teclado;
	private int[] sueldos;
	
	public Operarios(){
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		
		for(int f = 0; f < 5; f++){
			System.out.print("Ingrese el valor de la componente: ");
			sueldos[f] = teclado.nextInt();
		}
		
	}
	
	public void imprimir(){
		for(int i = 0; i < 5; i++){
			System.out.println(sueldos[i]);
		}
	}

	public static void main(String[] arg){
		Operarios prueba = new Operarios();
		prueba.imprimir();
	}
	
	
}
