/*
 * Se cuenta con la siguiente información:
Las edades de 50 estudiantes del turno mañana.
Las edades de 60 estudiantes del turno tarde.
Las edades de 110 estudiantes del turno noche.
Las edades de cada estudiante deben ingresarse por teclado.
a) Obtener el promedio de las edades de cada turno (tres promedios)
b) Imprimir dichos promedios (promedio de cada turno)
c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades mayor. 
 * 
 * */

package capitulo11;

public class EdadesTurnos {
	
	public static void main(String[] args){
		int turnomaniana = 0, turnotarde = 0, turnonoche = 0;
		int sumamaniana = 0, sumatarde = 0, sumanoche =0;
		float promediomaniana, promediotarde, promedionoche;
		
		for(int i = 0; i <= 50; i++){
			sumamaniana += turnomaniana;
		}
		promediomaniana = sumamaniana / 50;
		System.out.println("El promedio de el turno mañana es: " + promediomaniana);
		
		for(int i = 0; i <= 60; i++){
			sumatarde += turnotarde;
		}
		promediotarde = sumamaniana / 50;
		System.out.println("El promedio de el turno tarde es: " + promediotarde);
		
		for(int i = 0; i <= 110; i++){
			sumanoche += turnonoche;
		}
		promedionoche = sumanoche / 110;
		System.out.println("El promedio de el turno noche es: " + promedionoche);
		
		if(promediomaniana > promediotarde){
			if(promediomaniana > promedionoche){
				System.out.println("El promedio de la mañana es el mayor");
			} else {
				System.out.println("El proedio del turno noche es el mayor");
			}
		} else {
			if (promediotarde > promedionoche){
				System.out.println("El promedio del turno tarde es el mayor");
			} else { 
				System.out.println("El promedio de turno noche es el mayor");
			}
		}
	}

}
