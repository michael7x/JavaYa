package capitulo32;

import javax.swing.*;

public class Formulario extends JFrame {
	private JLabel label1, label2;
	public Formulario(){
		setLayout(null);
		label1 = new JLabel("Sistema de Facturacion.");
		label1.setBounds(10,20,300,30);
		add(label1);
		label2 = new JLabel("Version 1.0");
		label2.setBounds(10,100,100,30);
		add(label2);
	}

	public static void main(String[] arg){
		Formulario prueba = new Formulario();
		prueba.setBounds(0,0,300,200);
		prueba.setResizable(true);
		prueba.setVisible(true);
		
		
		
	}
	
}
