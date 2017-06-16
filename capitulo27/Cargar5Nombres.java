/*
Confeccionar un programa que permita cargar los nombres de 5 personas y sus mail, luego implementar los siguientes métodos:
a) Mostrar por pantalla los datos.
b) Consulta del mail ingresando su nombre.
c) Mostrar los mail que no tienen el carácter @ 
 */

package capitulo27;

import java.util.Scanner;

public class Cargar5Nombres {
	private Scanner teclado;
	private String nombres[];
	private String mails[];

	
	public Cargar5Nombres(){
		teclado = new Scanner(System.in);
		nombres = new String[5];
		mails = new String[5];
		
		System.out.println("Ahora cargará 5 nombres y e-mails");
		for(int i = 0; i < 5 ; i++){
			System.out.print("Ingrese nombre: ");
			nombres[i] = teclado.nextLine();
			System.out.print("Ingrese mail: ");
			mails[i] = teclado.nextLine();
		}
		
	}

	// A - Mostrar por pantalla los datos
	public void imprimirDatos(){
		for(int i = 0; i < 5; i++){
			System.out.println("Nombre: " + nombres[i]);
			System.out.println("Mail: " + mails[i]);
		}
	}

	// B - Consulta del mail ingresando su nombre
	public void consultarMail(){
		String nombreAConsultar;
		
		System.out.print("¿El mail de quién quiere saber? ");
		nombreAConsultar = teclado.next();

		boolean existe = false;
		
		for(int i = 0; i < nombres.length; i++){
			
			
			if(nombreAConsultar.equals(nombres[i])){
				System.out.println("El mail de la persona es: " + mails[i]);
				existe = true;
			}
		}
		if (existe == false){
			System.out.println("No existe una persona con ese nombre");
		}
	}

	// C - Mostrar los mails que no tienen @
	public void tieneArroba(){
		int tieneArroba;
		for(int i = 0; i < mails.length; i++){
			tieneArroba = mails[i].indexOf('@');
			if(tieneArroba == -1){
				System.out.println("No contiene arroba" + nombres[i]);				
			} else {
				System.out.println("Todos los nombres tienen arroba");
			}
			
		}
	}

	public static void main(String[] arg){
		Cargar5Nombres prueba = new Cargar5Nombres();
		//prueba.imprimirDatos();
		//prueba.consultarMail();
		prueba.tieneArroba();
	}
	
}
