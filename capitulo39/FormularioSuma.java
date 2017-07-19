package capitulo39;

import javax.swing.*;
import java.awt.event.*;

public class FormularioSuma extends JFrame implements ActionListener{
	private JTextField textfield1, textfield2;
	private JRadioButton radio1, radio2;
	private ButtonGroup bg;
	private JButton boton;
	
	public FormularioSuma(){
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,150,20);
		add(textfield1);
		textfield2 = new JTextField();
		textfield2.setBounds(10,50,150,20);
		add(textfield2);
		bg = new ButtonGroup();
		radio1 = new JRadioButton("Sumar");
		radio1.setBounds(10,100,100,30);
		bg.add(radio1);
		add(radio1);
		radio2= new JRadioButton("Restar");
		radio2.setBounds(10,150,100,30);
		bg.add(radio2);
		add(radio2);
		boton = new JButton("Realizar Operacion");
		boton.setBounds(10, 200, 200, 30);
		boton.addActionListener(this);
		add(boton);	
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton){
			int val1 = Integer.parseInt(textfield1.getText());
			int val2 = Integer.parseInt(textfield2.getText());
			int resultado = 0;
			if(radio1.isSelected()){
				resultado = val1 + val2;
			}
			if(radio2.isSelected()){
				resultado = val1 - val2;
			}
			setTitle(String.valueOf(resultado));
		}

	}
	
	public static void main(String[] arg){
		FormularioSuma prueba = new FormularioSuma();
		prueba.setBounds(0,0,300,300);
		prueba.setVisible(true);
	}
}
