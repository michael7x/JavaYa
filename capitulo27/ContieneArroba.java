/*Realizar una clase, que permita cargar una dirección de mail en el constructor, luego en otro método mostrar un mensaje si contiene el caracter '@'. */
package capitulo27;

import java.util.Scanner;

public class ContieneArroba {
	private Scanner teclado;
	private String mail;
	
	public ContieneArroba(){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese la cadena de texto: ");
		mail = teclado.next();
	}
	
	public void tieneArroba(){
		int tieneArroba = mail.indexOf('@');
		if (tieneArroba == -1){
			System.out.println("No tiene @");
		} else {
			System.out.println("Tiene @");
		}
	}

	public static void main(String[] arg){
		ContieneArroba prueba = new ContieneArroba();
		prueba.tieneArroba();
	}
}
