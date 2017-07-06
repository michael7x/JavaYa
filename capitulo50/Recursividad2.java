package capitulo50;

public class Recursividad2 {
	
	void imprimir(int x){
		System.out.println(x);
		imprimir(x-1);
	}
	
	public static void main(String[] arg){
		Recursividad2 prueba = new Recursividad2();
		prueba.imprimir(7);
	}

}
