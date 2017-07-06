package capitulo50;

public class Recursividad3 {
	
	void imprimir(int x){
		if(x > 0){
			System.out.println(x);
			imprimir(x-1);
		}
	}
	
	public static void main(String[] arg){
		Recursividad3 prueba = new Recursividad3();
		prueba.imprimir(9);
	}

}
