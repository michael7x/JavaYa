package capitulo48;

public class ListaGenericaDoble {
	
	class Nodo{
		int info;
		Nodo ant, sig;
	}
	
	private Nodo raiz;
	
	public ListaGenericaDoble(){
		raiz = null;
	}

	public void insertarPrimero(int x){
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if(raiz == null){
			raiz = nuevo;
		} else {
			Nodo reco = raiz;
			while (reco.sig != null){
				reco = reco.sig;
			}
			reco.sig = nuevo;
			nuevo.ant = reco;
		}
		
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
			nuevo.ant = reco;
		}
	}

	public void insertarSegundo(int x){
		if(raiz != null){
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if(raiz.sig == null){
				raiz.sig = nuevo;
				nuevo.ant = raiz;
			} else {
				Nodo tercero = raiz.sig;
				nuevo.sig = tercero;
				tercero.ant = nuevo;
				raiz.sig = nuevo;
				nuevo.ant = raiz;
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
				Nodo reco = raiz;
				while (reco.sig != null){
					reco = reco.sig;
				}
				Nodo anterior = reco.ant;
				nuevo.sig = reco;
				nuevo.ant = anterior;
				anterior.sig = nuevo;
				reco.ant = nuevo;
			}
		}
	}

	public void borrarPrimero(){
		if(raiz != null){
			raiz = raiz.sig;
		}
	}
	
	public void borrarSegundo(){
		if(raiz != null){
			if(raiz.sig != null){
				Nodo tercero = raiz.sig;
				tercero = tercero.sig;
				raiz.sig = tercero;
				if(tercero!=null){
					tercero.ant = raiz;
				}
			}
		}
	}

	public void borrarUltimo(){
		if(raiz != null){
			if(raiz.sig == null){
				raiz = null;
			} else {
				Nodo reco = raiz;
				while(reco.sig != null){
					reco = reco.sig;
				}
				reco = reco.ant;
				reco.sig = null;
			}
		}
	}

	public void imprimir(){
		Nodo reco = raiz;
		while (reco != null){
			System.out.print(reco.info + " - ");
			reco = reco.sig;
		}
		System.out.println();
	}

	public void borrarMayor(){
		if(raiz != null){
			Nodo reco = raiz;
			int may = raiz.info;
			while(reco != null){
				if(reco.info > may){
					may = reco.info;
				}
				reco = reco.sig;
			}
			reco = raiz;
			while(reco != null){
				if(reco.info== may){
					if(reco == raiz){
						raiz = raiz.sig;
						if(raiz != null){
							raiz.ant = null;
						}
						reco = raiz;
					} else {
						Nodo atras = reco.ant;
						atras.sig = reco.sig;
						reco = reco.sig;
						if( reco!=null ){
							reco.ant = atras;
						}
					}
				} else {
					reco = reco.sig;
				}
			}
		}
	}

	public static void main(String[] arg){
		ListaGenericaDoble prueba = new ListaGenericaDoble();
		prueba.insertarPrimero(20);
		prueba.insertarPrimero(45);
		prueba.insertarPrimero(68);
		prueba.insertarPrimero(70);
		prueba.imprimir();
		System.out.println("Insertamos al final");
		prueba.insertarUltimo(160);
		prueba.imprimir();
		System.out.println("Insertamos el segundo");
		prueba.insertarSegundo(52);
		prueba.imprimir();
		System.out.println("Insertar anteúltimo");
		prueba.insertarAnteUltimo(526);
		prueba.imprimir();
		System.out.println("Borrar el primero");
		prueba.borrarPrimero();
		prueba.imprimir();
		System.out.println("Borrar el segundo");
		prueba.borrarSegundo();
		prueba.imprimir();
		System.out.println("Borrar el ultimo");
		prueba.borrarUltimo();
		prueba.imprimir();
		System.out.println("Borrar el mayor");
		prueba.borrarMayor();
		prueba.imprimir();



		

	}

	

	
}
