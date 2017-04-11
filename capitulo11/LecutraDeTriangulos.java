/* Ej5: 
Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.
c) Tipo de triángulo que posee menor cantidad.  
*/
// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=11&codigo=84&inicio=0

package capitulo11;
import java.util.Scanner;

public class LecutraDeTriangulos {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int numerodetriangulos;
		int equilatero = 0;
		int isoceles = 0;
		int escaleno = 0;
		float lado1, lado2, lado3;
		
		System.out.print("Por favor ingrese la cantidad de triángulos a ingresar: ");
		numerodetriangulos = teclado.nextInt();
		
		for(int i = 1; i<=numerodetriangulos;i++){
			System.out.print("Por favor ingrese el lado 1: ");
			lado1 = teclado.nextFloat();
			System.out.print("Por favor ingrese el lado 2: ");
			lado2 = teclado.nextFloat();
			System.out.print("Por favor ingrese el lado 3: ");
			lado3 = teclado.nextFloat();
			
			if(lado1 == lado2 && lado1 == lado3){
				System.out.println("Este triángulo es equilátero");
				equilatero++; 
			} else {
				if(lado1 != lado2 && lado2 != lado3){
					System.out.println("Este triángulo es escaleno");
					escaleno++;
				} else {
					System.out.println("Este triángulo es isóceles");
					isoceles++;
				}
			}					
		}
		
		
		if(equilatero > escaleno){
			if (equilatero > isoceles){
				System.out.println("Hay más tríangulos equilateros");
			} else {
				System.out.println("Hay más triángulos isoceles");
			}
		} else {
			if(escaleno > isoceles){
				System.out.println("Hay más triángulos escalenos");
			} else {
				System.out.println("Hay más triángulo isoceles");
			}
		}
		
	}
	
}
