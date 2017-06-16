/*
 Codifique un programa que permita cargar una oración por teclado, luego mostrar cada palabra ingresada en una línea distinta.  
 */

package capitulo27;

import java.util.Scanner;

public class OracionALetra {
	private Scanner teclado;
	private String texto;
	
	public OracionALetra(){
		teclado = new Scanner(System.in);
		System.out.println("Por favor ingrese el texto: ");
		texto = teclado.nextLine();
	}
	
	public void oracionALetra(){
		for(int i = 0; i < texto.length(); i++){
			if(texto.charAt(i)== ' '){
				System.out.println();
			} else {
				System.out.print(texto.charAt(i));
			}
		}
	}	

	public static void main(String[] arg){
		OracionALetra prueba = new OracionALetra();
		prueba.oracionALetra();
	}


}
