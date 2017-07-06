package capitulo32;

import javax.swing.*;

public class FormularioColores extends JFrame {
	private JLabel label1, label2, label3;
	
	public FormularioColores(){
		setLayout(null);
		label1 = new JLabel("Rojo");
		label1.setBounds(10,20,300,30);
		add(label1);

		label2 = new JLabel("Amarillo");
		label2.setBounds(10,120,300,30);
		add(label2);	

		label3 = new JLabel("Verde");
		label3.setBounds(10,220,300,30);
		add(label3);		
	}
	
	public static void main (String[] arg){
		FormularioColores prueba = new FormularioColores();
		prueba.setBounds(10, 10, 300, 300);
		prueba.setResizable(false);
		prueba.setVisible(true);
	}
	
}
