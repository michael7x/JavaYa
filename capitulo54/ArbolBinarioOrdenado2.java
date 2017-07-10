package capitulo54;


public class ArbolBinarioOrdenado2 {
	
	class Nodo{
		int info;
		Nodo izq, der;
	}
	
	Nodo raiz;
	int cant;
	int altura;
	
	public ArbolBinarioOrdenado2(){
		raiz = null;
	}
	
	public boolean existe(int info){
		Nodo reco = raiz;
		while (reco != null){
			if(info==reco.info){
				return true;
			} else {
				if(info > reco.info){
					reco = reco.der;
				}else{
					reco = reco.izq;
				}
			}
		}
		return false;
	}

	public void insertar(int info){
		if(!existe(info)){
			Nodo nuevo;
			nuevo = new Nodo();
			nuevo.info = info;
			nuevo.izq = null;
			nuevo.der = null;
			
			if(raiz == null){
				raiz = nuevo;
			} else {
				Nodo anterior = null, reco;
				reco = raiz;
				while(reco != null){
					anterior = reco;
					if(info < reco.info)
						reco = reco.izq;
					else
						reco = reco.der;
				}
				if(info<anterior.info)
					anterior.izq = nuevo;
				else
					anterior.der = nuevo;
			}
				
		}
	}
	
	private void imprimirEntre(Nodo reco){
		if(reco != null){
			imprimirEntre(reco.izq);
			System.out.print(reco.info + " ");
			imprimirEntre(reco.der);
			
		}
	}
	
	public void imprimirEntre(){
		imprimirEntre(raiz);
		System.out.println();
	}

	private void cantidad(Nodo reco){
		if(reco != null){
			cant++;
			cantidad(reco.izq);
			cantidad(reco.der);
		}
	}

	public int cantidad(){
		cant = 0;
		cantidad(raiz);
		return cant;
	}

	private void cantidadNodosHojas(Nodo reco){
		if(reco != null){
			if(reco.izq == null && reco.der==null)
				cant++;
			cantidadNodosHojas(reco.izq);
			cantidadNodosHojas(reco.der);
		}
	}

	public int cantidadNodosHojas(){
		cant = 0;
		cantidadNodosHojas(raiz);
		return cant;
	}

	private void imprimirEntreConNivel(Nodo reco, int nivel){
		if(reco != null){
			imprimirEntreConNivel(reco.izq, nivel + 1);
			System.out.print(reco.info + "("+nivel+") - ");
			imprimirEntreConNivel(reco.der, nivel+1);
		}
	}

	public void  imprimirEntreConNivel(){
		imprimirEntreConNivel(raiz, 1);
		System.out.println();
	}

	private void retornarAltura(Nodo reco, int nivel){
		if(reco != null){
			retornarAltura(reco.izq, nivel+1);
			if(nivel>altura)
				altura = nivel;
			retornarAltura(reco.der, nivel+1);
		}
	}

	public int retornarAltura(){
		altura = 0;
		retornarAltura(raiz, 1);
		return altura;
	}

	public void mayorValor(){
		if(raiz != null){
			Nodo reco = raiz;
			while (reco.der != null)
				reco = reco.der;
			System.out.println("Mayor valor del arbol: " + reco.info);
		}
	}

	public void borrarMenor(){
		if(raiz != null){
			if (raiz.izq == null)
				raiz = raiz.der;
			else{
				Nodo atras = raiz;
				Nodo reco = raiz.izq;
				while(reco.izq != null){
					atras = reco;
					reco = reco.izq;
				}
				atras.izq = reco.der;
			}
		}
	}
	
	public static void main(String[] arg){
		ArbolBinarioOrdenado2 prueba = new ArbolBinarioOrdenado2();
		prueba.insertar(100);
		prueba.insertar(50);
		prueba.insertar(25);
		prueba.insertar(75);
		prueba.insertar(150);
		System.out.println("Impresion entre orden: ");
		prueba.imprimirEntre();
		System.out.println("Cantidad de nodods del arbol: "+ prueba.cantidad());
		System.out.println("Cantidad de nodos hoja: "+ prueba.cantidadNodosHojas());
		System.out.println("Impresion en entre orden:");
		prueba.imprimirEntreConNivel();
		System.out.println("Altura del arbol:");
		System.out.println(prueba.retornarAltura());
		prueba.mayorValor();
		prueba.borrarMenor();
		System.out.println("Lueo de borrar el menor: ");
		prueba.imprimirEntre();
	}
	
	
}
