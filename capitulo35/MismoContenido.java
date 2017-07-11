package capitulo35;

import java.awt.event.*;
import javax.swing.*;

public class MismoContenido extends JFrame implements ActionListener{
	private JTextArea textarea1, textarea2;
	private JScrollPane scrollpane1, scrollpane2;
	private JButton boton1;
	
	public MismoContenido(){
		setLayout(null);
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,10,200,140);
		add(scrollpane1);

		textarea2 = new JTextArea();
		scrollpane2 = new JScrollPane(textarea2);
		scrollpane2.setBounds(220,10,200,140);
		add(scrollpane2);
		
		
		boton1 = new JButton("Verificar");
		boton1.setBounds(100,250,150,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String texto1 = textarea1.getText();
			String texto2 = textarea2.getText();
			if(texto1.equals(texto2)){
				setTitle("Tienen el mismo texto");
			} else {
				setTitle("Tienen texto diferente");
			}
		}
	}

	public static void main(String[] arg){
		MismoContenido prueba = new MismoContenido();
		prueba.setBounds(0,0,500,500);
		prueba.setVisible(true);
		
	}
	
	
}
