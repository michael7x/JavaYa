/*
Se desea guardar los sueldos de 5 operarios.
Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.
Empleando un vector solo se requiere definir un único nombre y accedemos a cada elemento por medio del subíndice.
*/

package capitulo16;

import java.util.Scanner;

public class PruebaVector1 {
		private Scanner teclado;
		private int[] sueldos;
		
		public void cargar()
		{
			teclado = new Scanner(System.in);
			sueldos = new int[5];
			for(int f = 0; f < 5; f++){
				System.out.print("Ingrese valor de la componente: ");
				sueldos[f] = teclado.nextInt();
			}
		}
		
		public void imprimir(){
			for(int f = 0; f < 5; f++){
				System.out.println(sueldos[f]);
			}
		}
		
		public static void main(String[] ar){
			PruebaVector1 pv =new PruebaVector1();
			pv.cargar();
			pv.imprimir();
		}
}
