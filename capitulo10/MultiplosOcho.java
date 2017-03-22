/* 
*Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.  
*/
//De https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0

package capitulo10;

public class MultiplosOcho {
	
	public static void main(String args[]){
		int n = 0;
		int resultado = 0;
		
	while(resultado <= 500){
		resultado = resultado + 8;
		System.out.print(resultado + "-");
	}			
			
	}
	
}
