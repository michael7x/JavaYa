package capitulo34;

import javax.swing.*;
import java.awt.event.*;

public class FormularioContrasenia extends JFrame implements ActionListener{
	private JTextField textfield1, textfield2;
	private JLabel label1, label2;
	private JButton boton1;
	
	public FormularioContrasenia(){
		setLayout(null);
		label1 = new JLabel("Usuario");
		label1.setBounds(10, 10, 100, 30);
		add(label1);
		textfield1 = new JTextField();
		textfield1.setBounds(100, 10, 150, 20);
		add(textfield1);
		
		label2 = new JLabel("Contraseña");
		label2.setBounds(10, 50, 100, 30);
		add(label2);
		textfield2 = new JTextField();
		textfield2.setBounds(100, 50, 150, 20);
		add(textfield2);
		
		boton1 = new JButton("Checkear");
		boton1.setBounds(100, 90, 100, 30);
		add(boton1);
		boton1.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			String cad1 = textfield1.getText();
			String cad2 = textfield2.getText();
			if(cad1.equals("juan") && cad2.equals("abc123")){
				setTitle("Correcto");
			} else {
				setTitle("Incorrecto");
			}
		}
	}
	
	public static void main(String[] arg){
		FormularioContrasenia prueba = new FormularioContrasenia();
		prueba.setBounds(0,0,300, 200);
		prueba.setVisible(true);
	}
}
