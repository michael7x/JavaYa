package capitulo42;

public class Pila3 {
	
	class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	public Pila3(){
		raiz = null;
	}

	public void insertar(int x){
		Nodo nuevo;
		nuevo =new Nodo();
		nuevo.info = x;
		
		if(raiz==null){
			nuevo.sig = null;
			raiz = nuevo;
		}
		else
		{
			nuevo.sig = raiz;
			raiz = nuevo;
		}
	}

	public int extraer()
	{
		if(raiz != null)
		{
			int informacion = raiz.info;
			raiz = raiz.sig;
			return informacion;
		}
		else
		{
			return Integer.MAX_VALUE;
		}
	}

	public int retornar()
	{
		if(raiz != null)
		{
			int informacion = raiz.info;
			return informacion;
		}
		else
		{
			return Integer.MAX_VALUE;
		}
	}
	
	public void imprimir(){
		Nodo reco = raiz;
		System.out.println("Listados de todos los elementos de la pila.");
		while (reco != null){
			System.out.print(reco.info + "-");
			reco = reco.sig;
		}
		System.out.println();
	}

	public static void main(String[] arg){
		Pila3 pilaprueba = new Pila3();
		pilaprueba.insertar(10);
		pilaprueba.insertar(40);
		pilaprueba.insertar(3);
		pilaprueba.imprimir();
		System.out.println("Extraemos de la pila: " + pilaprueba.extraer());
		pilaprueba.imprimir();
		System.out.println("Retornamos prilero de la pila:" + pilaprueba.retornar());
		pilaprueba.imprimir();
		
	}


}
