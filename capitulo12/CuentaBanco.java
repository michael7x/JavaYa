/*
 * En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:

Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

b) La suma total de los saldos acreedores. 
 * 
 * 
 * */

package capitulo12;

import java.util.Scanner;


public class CuentaBanco {
	
	public static void main(String[] arg){
		Scanner teclado = new Scanner(System.in);
		int cuenta;
		float monto, saldo;
		saldo = 0;
		monto = 0;
		
		
		do{
			System.out.println("Por favor ingrese el número de la cuenta. Si ingresa una cuenta negativa finalizará");
			cuenta = teclado.nextInt();
			
			if (cuenta >= 0){
				System.out.print("Por favor ingrese el saldo: ");
				saldo = teclado.nextFloat();
				if (saldo > 0){
					System.out.println("Saldo Acreedor");
					monto += saldo;
				} else {
					if (saldo < 0){
						System.out.println("Saldo deudor");
					} else {
						System.out.println("Saldo Nulo");
					}
				}
				
				
			}
			
		}while( cuenta >= 0);
		System.out.print("Total de saldo acreedor: " + monto);
		
	}

}
