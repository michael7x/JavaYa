/*Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite dentro del vector.*/

package capitulo19;

import java.util.Scanner;

public class MenorYRepitente {
	private Scanner teclado;
	private int[] numeros;
	private int menor;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.print("¿Cuántos elementos ingresará? ");
		int tamVector = teclado.nextInt();
		numeros = new int[tamVector];
		
		for(int i = 0; i < numeros.length; i++){
			System.out.print("Por favor ingrese un número: ");
			numeros[i] = teclado.nextInt();
		}
	}
	
	public void menorValor(){
		int menor = numeros[0];
		for(int i = 1; i < numeros.length; i++){
			if (menor > numeros[i]){
				menor = numeros[i];
			}
		}
		System.out.println("El número menor es: " + menor);
	}

	public void seRepiteElMenor(){
		int repeticiones = 0;

		for(int i = 0; i < numeros.length;i++){
			if(numeros[i] == menor){
				repeticiones++;
			}
		}
		
		if (repeticiones > 0){
			System.out.println("El valor menor se repite");
		} else {
			System.out.println("El valor menor no se repite");
		}
	}

	public static void main(String[] arg){
		MenorYRepitente pruebaMenor = new MenorYRepitente();
		pruebaMenor.cargar();
		pruebaMenor.menorValor();
		pruebaMenor.seRepiteElMenor();
	}
}
