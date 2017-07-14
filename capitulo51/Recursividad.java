package capitulo51;

public class Recursividad {
	
	class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	void insertarPrimero(int x)
	{
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = raiz;
		raiz = nuevo;
	}

	public void imprimirInversa(Nodo reco){
		if(reco != null){
			imprimirInversa(reco.sig);
			System.out.print(reco.info+" - ");
		}
	}
	
	public void imprimirInversa(){
		imprimirInversa(raiz);
	}
	
	public static void main(String[] arg){
		Recursividad r = new Recursividad();
		r.insertarPrimero(10);
		r.insertarPrimero(4);
		r.insertarPrimero(5);
		r.imprimirInversa();
	}
}
