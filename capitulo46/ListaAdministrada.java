package capitulo46;

public class ListaAdministrada {
	
	class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	public ListaAdministrada(){
		raiz = null;
	}
	
	void insertarPrimero(int x){
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = raiz;
		raiz = nuevo;
	}

	public void insertarUltimo(int x){
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if(raiz == null){
			raiz = nuevo;
		} else {
			Nodo reco = raiz;
			while(reco.sig != null){
				reco = reco.sig;
			}
			reco.sig = nuevo;
		}
	}

	public void insertarSegundo(int x){
		if(raiz != null){
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if(raiz.sig == null){
				raiz.sig = nuevo;
			} else {
				nuevo.sig = raiz.sig;
				raiz.sig = nuevo;
			}
		}
	}

	public void insertarAnteUltimo(int x){
		if(raiz != null){
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if(raiz.sig == null){
				nuevo.sig = raiz;
				raiz = nuevo;
			} else {
				Nodo atras = raiz;
				Nodo reco = raiz.sig;
				while(reco.sig != null){
					atras = reco;
					reco = reco.sig;
				}
				nuevo.sig = atras.sig;
				atras.sig = nuevo;
			}
		}
	}
	
	public void borrarPrimero(){
		if(raiz != null){
			raiz = raiz.sig;
		}
	}

	public void borrarSegundo(){
		if(raiz!=null){
			if(raiz.sig != null){
				Nodo tercero = raiz.sig;
				tercero = tercero.sig;
				raiz.sig = tercero;
			}
		}
	}
	
	public void borrarUltimo(){
		if(raiz != null){
			if(raiz.sig==null){
				raiz = null;
			} else {
				Nodo reco = raiz.sig;
				Nodo atras = reco;
				while(reco.sig != null){
					atras = reco;
					reco = reco.sig;
				}
				atras.sig = null;
			}
		}
	}
	
	public void imprimir(){
		Nodo reco = raiz;
		while(reco != null){
			System.out.print(reco.info + "-");
			reco = reco.sig;
		}
		System.out.println();
	}
	
	public void borrarMayor(){
		if(raiz != null){
			Nodo reco = raiz;
			int may = raiz.info;
			while(reco != null){
				if(reco.info>may){
					may = reco.info;
				}
				reco = reco.sig;
			}
			reco = raiz;
			Nodo atras = raiz;
			while(reco != null){
				if(reco.info == may){
					if(reco == raiz){
						raiz = raiz.sig;
						atras = raiz;
						reco = raiz;
					} else {
						atras.sig = reco.sig;
						reco = reco.sig;
					}
				} else {
					atras = reco;
					reco = reco.sig;
				}
			}
		}
	}

	public static void main(String[] arg){
		ListaAdministrada lg = new ListaAdministrada();
		lg.insertarPrimero(20);
		lg.insertarPrimero(50);
		lg.insertarPrimero(70);
		lg.insertarPrimero(125);
		lg.imprimir();
		
		System.out.println("Insertamos un nodo al final: ");
		lg.insertarUltimo(160);
		lg.imprimir();
		
		System.out.println("Insertamos un nodo en la segunda posición: ");
		lg.insertarSegundo(13);
		lg.imprimir();
		
		System.out.println("Insertamos un nodo en la anteúltima posición: ");
		lg.insertarAnteUltimo(25);
		lg.imprimir();
		
		System.out.println("Borramos el primer nodo de la lista: ");
		lg.borrarPrimero();
		lg.imprimir();
		
		System.out.println("Borramos el segundo nodo de la lista: ");
		lg.borrarSegundo();
		lg.imprimir();
		
		System.out.println("Borramos el último de la lista: ");
		lg.borrarUltimo();
		lg.imprimir();
		
		System.out.println("Borramos el mayor de la lista:");
		lg.borrarMayor();
		lg.imprimir();
	}
	
	
	
}
