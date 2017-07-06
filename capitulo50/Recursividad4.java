package capitulo50;

public class Recursividad4 {
	
	void imprimir(int x){
		if(x > 0){
			imprimir(x-1);
			System.out.println(x);
		}
	}

	public static void main(String[] arg){
		Recursividad4 prueba = new Recursividad4();
		prueba.imprimir(5);
	}
}
