/*
*Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado) 
*/
//De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0

package capitulo10;

public class VeinticincoTérminos {

	public static void main(String[] arg){
		int n = 0;
		int multiplosdeonce = 11;
		
		while(n <= 25){
			System.out.println("11 x " + n + " = " + multiplosdeonce*n );
			n++;
		}				
	}
}
