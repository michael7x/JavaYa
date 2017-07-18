package capitulo38;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class FormularioNavegador extends JFrame implements ActionListener{
	private JCheckBox check1, check2, check3;
	private JButton boton1;
	
	public FormularioNavegador(){
		setLayout(null);
		check1 = new JCheckBox("Firefox");
		check1.setBounds(10,10,150,30);
		add(check1);
		
		check2 = new JCheckBox("Chrome");
		check2.setBounds(10,50,150,30);
		add(check2);
		
		check3 = new JCheckBox("Internet Explorer");
		check3.setBounds(10,90,150,30);
		add(check3);
		
		boton1 = new JButton("Verificar");
		boton1.setBounds(10, 140, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String cad = "";
			if(check1.isSelected()==true){
				cad = cad + " Firefox ";
			}
			if(check2.isSelected()==true){
				cad = cad + " Chrome ";
			}
			if(check3.isSelected()==true){
				cad = cad + " Internet Explorer ";
			}			
			setTitle(cad);
		}
	}
	
	public static void main(String[] arg){
		FormularioNavegador prueba = new FormularioNavegador();
		prueba.setBounds(0,0,400,400);
		prueba.setVisible(true);
	}

}
