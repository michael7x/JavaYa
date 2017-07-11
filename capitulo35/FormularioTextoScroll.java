package capitulo35;

import javax.swing.*;

public class FormularioTextoScroll extends JFrame{
	private JTextField textfield1;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	
	public FormularioTextoScroll(){
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,50,400,300);
		add(scrollpane1);
	}
	
	public static void main(String[] arg){
		FormularioTextoScroll prueba = new FormularioTextoScroll();
		prueba.setBounds(0,0,500,500);
		prueba.setVisible(true);
	}

}
