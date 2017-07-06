package capitulo50;

public class Recursividad5 {
	
	int factorial(int fact){
		if(fact > 0){
			int valor = fact * factorial(fact-1);
			return valor;
		} else {
			return 1;
		}
	}

	public static void main(String[] arg){
		Recursividad5 prueba = new Recursividad5();
		int resultado = prueba.factorial(4);
		System.out.println("El factorial de 4 es: " + resultado);
	}
	
}
