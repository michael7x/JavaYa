package capitulo27;

import java.util.Scanner;

public class Cadena1 {
	
	private static Scanner teclado;

	public static void main(String[] arg){
	
		teclado = new Scanner(System.in);
		String cad1, cad2;
		
		System.out.print("Ingrese la primera cadena: ");
		cad1 = teclado.nextLine();
		
		System.out.print("Ingrese la segunda cadena: ");
		cad2 = teclado.nextLine();
		
		// Metodo Equals
		if(cad1.equals(cad2) == true){
			System.out.println(cad1 + " es exactamente igual a " + cad2);
		} else {
			System.out.println(cad1 + " no es exactamente igual a " + cad2);
		}
		
		//Metodo Equals ignorando Case
		if(cad1.equalsIgnoreCase(cad2) == true){
			System.out.println(cad1 + " es exactamente, sin tener en cuenta las minúsculas y mayúsculas, igual a " + cad2);
		} else {
			System.out.println(cad1 + " no es igual a " + cad2);
		}
		
		//Metodo Compare
		if(cad1.compareTo(cad2) == 0){
			System.out.println(cad1 + " es exactamente igual a " + cad2);
		} else {
			if(cad1.compareTo(cad2) > 0){
				System.out.println(cad1 + " es mayor alfabeticamente que  " + cad2);
			} else {
				System.out.println(cad2 + " es mayor alfabeticamente que  " + cad1);
			}	
		}
		
		//El primer caracter
		char carac1 = cad1.charAt(0);
		System.out.println("El primera caracter de"+ cad1 +" es "+ carac1);

		//largo de la cadena
		int largo = cad1.length();
		System.out.println("El largo del string " + cad1 + " es " + largo );
		
		//Metodo Substring
		String cad3 = cad1.substring(0,3);
		System.out.println("Los primeros tres caracteres de " + cad1 + " son " + cad3);
		
		//Metodo index para buscar intersección entre cadenas.
		int pos = cad1.indexOf(cad2);
		if (pos == -1){
			System.out.println(cad2 + " no está contenida en " + cad1);
		} else {
			System.out.println(cad2 + " está contenida en " + cad1 + " a partir de la posición " + pos);
		}
		
		//Metodo upper Case
		System.out.println(cad1 + " Convertido a mayúscula es " + cad1.toUpperCase());

		//Metodo lower case
		System.out.println(cad1 + " Convertido a minúscula es " + cad1.toLowerCase());
	}
}
