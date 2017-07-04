package capitulo49;

public class ListaCircular {
	
	class Nodo{
		int info;
		Nodo ant, sig;
	}

	private Nodo raiz;
	
	public ListaCircular(){
		raiz = null;
	}

	public void insertarPrimero(int x){
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if(raiz == null){
			nuevo.sig = nuevo;
			nuevo.ant = nuevo;
			raiz = nuevo;
		} else {
			Nodo ultimo = raiz.ant;
			nuevo.sig=raiz;
			nuevo.ant=ultimo;
			raiz.ant = nuevo;
			ultimo.sig = nuevo;
			raiz = nuevo;
		}
	}

	public void insertarUltimo(int x){
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if(raiz == null){
			nuevo.sig = nuevo;
			nuevo.ant = nuevo;
			raiz = nuevo;
		} else {
			Nodo ultimo = raiz.ant;
			nuevo.sig = raiz;
			nuevo.ant = ultimo;
			raiz.ant = nuevo;
			ultimo.sig = nuevo;
		}
	}

	public boolean vacia(){
		if(raiz == null)
			return true;
		else
			return false;
	}
	
	public void imprimir(){
		if(!vacia()){
			Nodo reco = raiz;
			do{
				System.out.print(reco.info + " - ");
				reco = reco.sig;
			} while (reco != raiz);
		}System.out.println();
	}

	public int cantidad(){
		int cant = 0;
		if(!vacia()){
			Nodo reco = raiz;
			do{
				cant++;
				reco = reco.sig;
			} while (reco != raiz);
		}
		return cant;
	}

	public void borrar(int pos){
		if(pos <= cantidad()){
			if (pos == 1){
				if(cantidad() == 1){
					raiz = null;
				} else {
					Nodo ultimo = raiz.ant;
					raiz = raiz.sig;
					ultimo.sig = raiz;
					raiz.ant = ultimo;
				}
			} else {
				Nodo reco = raiz;
				for(int f = 1; f<=pos-1;f++){
					reco = reco.sig;
				}
				Nodo anterior = reco.ant;
				reco = reco.sig;
				anterior.sig = reco;
				reco.ant = anterior;
			}
		}
	}

	public static void main(String[] arg){
		ListaCircular prueba = new ListaCircular();
		prueba.insertarPrimero(100);
		prueba.insertarPrimero(45);
		prueba.insertarPrimero(12);
		prueba.insertarPrimero(4);
		System.out.println("Luego de insertar los cuatro primeros nodos");
		prueba.imprimir();
		prueba.insertarUltimo(20);
		prueba.insertarUltimo(14);
		System.out.println("Luego de insertar 2 en los últimos");
		prueba.imprimir();
		System.out.println("La cantidad de nodos es " + prueba.cantidad());
		System.out.println("Vamos a borrar las posiciones");
		System.out.println("Elimino la posición 2");
		prueba.borrar(2);
		prueba.imprimir();
		System.out.println("Elimino la posición 4");
		prueba.borrar(4);
		prueba.imprimir();
	}
	
}
