package capitulo50;

public class Recursividad {
	
	void repetir(){
		repetir();
	}
	
	public static void main(String[] arg){
		Recursividad prueba = new Recursividad();
		prueba.repetir();		
	}

}
