package capitulo45;

public class Cola2 {
	
	class Nodo{
		int info;
		Nodo sig;
	}
	
	Nodo raiz, fondo;
	
	Cola2(){
		raiz = null;
		fondo = null;
	}
	
	boolean vacia(){
		if(raiz == null)
			return true;
		else
			return false;
	}
	
	
	void insertar (int info)
	{
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.info = info;
		nuevo.sig = null;
		if(vacia()){
			raiz = nuevo;
			fondo = nuevo;
		} else{
			fondo.sig = nuevo;
			fondo = nuevo;
		}
	}

	int extraer(){
		if(!vacia()){
			int informacion = raiz.info;
			if(raiz == fondo){
				raiz = null;
				fondo = null;
			} else {
				raiz = raiz.sig;
			}
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}
	
	public void imprimir(){
		Nodo reco = raiz;
		System.out.println("Listado de todos los elementos en cola.");
		while(reco!=null){
			System.out.print(reco.info+"-");
			reco=reco.sig;
		}
		System.out.println();
	}
	
	public int cantidad(){
		int cant = 0;
		Nodo reco=raiz;
		while (reco!=null){
			cant++;
			reco=reco.sig;
		}
		return cant;
	}
	
}
