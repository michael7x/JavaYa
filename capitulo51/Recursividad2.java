package capitulo51;

import java.io.File;

public class Recursividad2 {
	
	public void leer(String inicio, String altura){
		File ar = new File(inicio);
		String[] dir = ar.list();
		
		for(int f = 0; f < dir.length;f++){
			File ar2 = new File(inicio + dir[f]);
			
			if(ar2.isFile())
				System.out.println(altura+dir[f]);
			if(ar2.isDirectory()){
				System.out.println(altura+"Directorio: "+dir[f].toUpperCase());
				leer(inicio+dir[f]+"\\", altura + " ");
			}
		}
	}
	
	public static void main(String[] arguments){
		Recursividad2 prueba = new Recursividad2();
		prueba.leer("c:\\windows\\","");
	}

}
