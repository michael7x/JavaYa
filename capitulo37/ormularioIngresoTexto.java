package capitulo37;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class FormularioIngresoTexto extends JFrame implements ActionListener {
	private JLabel label1, label2;
	private JTextField textfield1, textfield2;
	private JMenuBar menbarra;
	private JMenu menu1;
	private JMenuItem mi1, mi2;

	public FormularioIngresoTexto(){
		setLayout(null);
		
		label1 = new JLabel("Resolución 1");
		label1.setBounds(10, 10, 100,30);
		add(label1);
		textfield1 = new JTextField();
		textfield1.setBounds(10, 50, 100, 30);
		add(textfield1);
		label2 = new JLabel("Resolución 2");
		label2.setBounds(10, 50, 100, 30);
		add(label2);
		textfield2 = new JTextField();
		textfield2.setBounds(130, 50, 100, 30);
		add(textfield2);
		
		menbarra = new JMenuBar();
		setJMenuBar(menbarra);
		
		menu1 = new JMenu("Operaciones");
		menbarra.add(menu1);
		
		mi1 = new JMenuItem("Redimensionar");
		mi1.addActionListener(this);
		menu1.add(mi1);

		mi2 = new JMenuItem("Salir");
		mi2.addActionListener(this);
		menu1.add(mi2);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mi1){
			String cad1 = textfield1.getText();
			int resol1 = Integer.parseInt(cad1);
			String cad2 = textfield2.getText();
			int resol2 = Integer.parseInt(cad2);
			setSize(resol1, resol2);
		}
		if(e.getSource()==mi2){
			System.exit(0);
		}
				
	}
	
	public static void main(String[] arg){
		FormularioIngresoTexto prueba = new FormularioIngresoTexto();
		prueba.setBounds(0, 0, 300, 300);
		prueba.setVisible(true);
	}
}
