package capitulo33;

import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.event.*;

public class VaronyMujer extends JFrame implements ActionListener{
	JButton boton1, boton2;
	
	public VaronyMujer(){
		setLayout(null);
		
		boton1 = new JButton("Varón");
		boton1.setBounds(70,50,90,30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("Mujer");
		boton2.setBounds(170,50,90,30);
		add(boton2);
		boton2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== boton1){
			setTitle("Varón");
		}
		if(e.getSource()== boton2){
			setTitle("Mujer");
		}
	}

	public static void main(String[] ar){
		VaronyMujer prueba = new VaronyMujer();
		prueba.setBounds(0,0,350,200);
		prueba.setVisible(true);
	}
}
