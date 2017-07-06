package capitulo50;

public class Recursividad6 {
	static int[] vector = {312, 614, 88, 22, 54};
	
	void ordenar(int[] v, int cant){
		if(cant > 1){
			for(int f = 0; f < cant - 1; f++){
				if(v[f]> v[f+1]){
					int aux = v[f];
					v[f] = v[f+1];
					v[f+1] = aux;
				}
			}
			ordenar(v, cant-1);
		}
	}

	void imprimir(){
		for(int f = 0; f < vector.length; f++){
			System.out.println(vector[f] + " " );
		}
		System.out.println("\n");
	}

	public static void main(String[] arg){
		Recursividad6 prueba = new Recursividad6();
		prueba.imprimir();
		prueba.ordenar(vector, vector.length);
		prueba.imprimir();
	}
}
