package capitulo35;

import javax.swing.*;

public class FormularioTexto extends JFrame{
	private JTextField textfield1;
	private JTextArea textarea1;
	
	public FormularioTexto(){
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10, 10, 200, 30);
		add(textfield1);
		textarea1 = new JTextArea();
		textarea1.setBounds(10,50,400,300);
		add(textarea1);
	}
	
	public static void main(String[] arg){
		FormularioTexto prueba = new FormularioTexto();
		prueba.setBounds(0,0,540,400);
		prueba.setVisible(true);
	}

}
