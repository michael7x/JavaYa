package capitulo36;

import java.awt.event.*;
import javax.swing.*;

public class FormularioPais extends JFrame implements ActionListener {
	private JLabel label1, label2;
	private JTextField textfield1;
	private JComboBox combo1;
	private JButton boton1;

	public FormularioPais(){
		setLayout(null);
		label1 = new JLabel("Persona");
		label1.setBounds(10,10,100,30);
		add(label1);
		textfield1 = new JTextField();
		textfield1.setBounds(120,12,150,20);
		add(textfield1);
		label2 = new JLabel("Pais");
		label2.setBounds(10,50,100,30);
		add(label2);
		combo1 = new JComboBox();
		combo1.setBounds(120,50,100,30);
		add(combo1);
	    combo1.addItem("Argentina");
	    combo1.addItem("Chile");
	    combo1.addItem("Perú");
	    combo1.addItem("Paraguay");
	    combo1.addItem("Uruguay");
	    
	    boton1 = new JButton("Mostrar");
	    boton1.setBounds(70,100,130,30);
	    add(boton1);
	    boton1.addActionListener(this);
	    
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== boton1){
			String cad1 = textfield1.getText();
			String seleccionado = (String)combo1.getSelectedItem();
			setTitle("Hola " + cad1 + " Usted es de " + seleccionado);
		}
	}
	
	public static void main(String[] arg){
		FormularioPais prueba = new FormularioPais();
		prueba.setBounds(0,0,400,200);
		prueba.setVisible(true);
	}
}
