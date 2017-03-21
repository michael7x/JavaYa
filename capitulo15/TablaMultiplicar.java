// Ejemplo
/*
*Confeccionar una clase que permita ingresar valores enteros por teclado y nos muestre la tabla de multiplicar de dicho valor.
*Finalizar el programa al ingresar el -1.
*/
// De: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=15&codigo=88&inicio=0
package capitulo15;
import java.util.Scanner;

public class TablaMultiplicar{
	public void CargarValor(){
		Scanner teclado = new Scanner(System.in);
		int valor;
		do{
			System.out.print("Ingrese valor: ");
			valor = teclado.nextInt();
			if(valor!=-1){
				calcular(valor);
			}
		} while (valor != -1);
	}
	
	public void calcular(int v){
		for(int f=v; f<v*10;f=f+v){
			System.out.print(f+"-");
		}
		System.out.println();
	}
	public static void main(String[] arg){
		TablaMultiplicar tabla;
		tabla = new TablaMultiplicar();
		tabla.CargarValor();
	}
}
