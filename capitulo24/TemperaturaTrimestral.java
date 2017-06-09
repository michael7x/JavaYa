/*
Se desea saber la temperatura media trimestral de cuatro paises. Para ello se tiene como dato las temperaturas medias mensuales de dichos paises.
Se debe ingresar el nombre del país y seguidamente las tres temperaturas medias mensuales.
Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos en memoria.
a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
b - Imprimir los nombres de las paises y las temperaturas medias mensuales de las mismas.
c - Calcular la temperatura media trimestral de cada país.
b - Imprimir el nombre del país con la temperatura media trimestral mayor.  
 */

package capitulo24;

import java.util.Scanner;

public class TemperaturaTrimestral {
	private Scanner teclado;
	private String[] paises;
	private float[][] temperaturas;
	private float[] temperaturaTrim;	
	
	public void cargar(){
		teclado = new Scanner(System.in);
		paises = new String[4];
		temperaturas = new float[4][3];
		
		for(int f = 0; f < paises.length; f++){
			System.out.print("Por favor ingrese el nombre del país: ");
			paises[f] = teclado.next();
			
			for(int c = 0; c < temperaturas[f].length; c++){
				System.out.print("Ingrese la temperatura: ");
				temperaturas[f][c] = teclado.nextFloat();
			}
			
		}
		
		
	}

	public void imprimirTemperaturas(){
		System.out.println("Temperatura trimestral del país(por mes): ");
		for(int f = 0; f < paises.length; f++){
			System.out.print("Pais: " + paises[f]+":");
			for(int c = 0; c < temperaturas[f].length; c++){
				System.out.print(temperaturas[f][c] + ", ");
			}
			System.out.println();
		}
	}

	public void calcularTemperaturaTrimestral(){
		temperaturaTrim = new float[4];
		for(int f = 0; f<temperaturas.length;f++){
			float suma = 0;
			for(int c = 0; c < temperaturas[f].length; c++){
				suma = suma + temperaturas[f][c];
			}
			temperaturaTrim[f] = suma/3;
		}

	}
	
	public void imprimirTempTrimestrales(){
		System.out.println("Temperaturas trimestrales.");
		for(int f = 0; f < paises.length; f++ ){
			System.out.println(paises[f] + " : " + temperaturaTrim[f]);
		}
	}
	
	public void paisMayorTemperaturaTrim(){
		float may = temperaturaTrim[0];
		String nom = paises[0];
		for(int f= 0; f < temperaturaTrim.length; f++){
			if(temperaturaTrim[f]>may){
				may = temperaturaTrim[f];
				nom = paises[f];
			}
		}
		System.out.println("El país con mayor temperatura es " + nom + " que tiene una temperatura de " + may);
	}
	
	public static void main(String[] arg){
		TemperaturaTrimestral prueba = new TemperaturaTrimestral();
		prueba.cargar();
		prueba.imprimirTemperaturas();
		prueba.calcularTemperaturaTrimestral();
		prueba.imprimirTempTrimestrales();
		prueba.paisMayorTemperaturaTrim();
	}
	
}
