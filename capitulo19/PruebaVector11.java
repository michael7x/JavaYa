package capitulo19;

import java.util.Scanner;

public class PruebaVector11 {
	private Scanner teclado;
	private String[] nombres;
	private float[] sueldos;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		nombres = new String[5];
		sueldos = new float[5];
		
		for(int i = 0; i < nombres.length; i++){
			System.out.print("Por favor ingrese el nombre: ");
			nombres[i] = teclado.next();
			System.out.print("Por favor ingrese el sueldo: ");
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void mayorSueldo(){
		float mayor = sueldos[0];
		int pos = 0;
		
		for(int i = 1; i< nombres.length; i++){
			if(sueldos[i] > mayor){
				mayor = sueldos[i];
				pos = i;
			}
		}
		
		System.out.println("El empleado con mayor sueldoes "+nombres[pos]);
		System.out.println("Tiene un sueldo: "+ mayor);
	}
	
	public static void main(String[] ar){
		PruebaVector11 testvector = new PruebaVector11();
		testvector.cargar();
		testvector.mayorSueldo();
		
	}
}
