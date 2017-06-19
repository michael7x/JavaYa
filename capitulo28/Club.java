package capitulo28;

import java.util.Scanner;

public class Club {
	private Socio socio1, socio2, socio3;
	private Scanner teclado;
	
	public Club(){
		teclado = new Scanner(System.in);
		socio1 = new Socio(teclado);
		socio2 = new Socio(teclado);
		socio3 = new Socio(teclado);
	}
	
	public void socioMayor(){
		System.out.println("Socio con mayor antiguedad");
		if(socio1.retornarAntiguedad() > socio2.retornarAntiguedad() && socio1.retornarAntiguedad() > socio3.retornarAntiguedad()){
			socio1.imprimir();
		} else {
			if(socio2.retornarAntiguedad() > socio3.retornarAntiguedad()){
				socio2.imprimir();
			} else {
				socio3.imprimir();
			}
		}
	}

	public static void main(String[] arg){
		Club prueba = new Club();
		prueba.socioMayor();
	}
	
}
