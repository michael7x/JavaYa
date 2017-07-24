package capitulo56;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CajeroAutomatico extends JFrame {

	private JComboBox comboDinero;
	private JComboBox comboCuenta;
	private JLabel label3;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CajeroAutomatico frame = new CajeroAutomatico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CajeroAutomatico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Dinero a extraer");
		label1.setBounds(27, 27, 105, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Tipo de cuenta");
		label2.setBounds(261, 27, 89, 14);
		contentPane.add(label2);
		
		label3 = new JLabel("resultado");
		label3.setBounds(197, 198, 96, 14);
		contentPane.add(label3);
		
		JButton boton = new JButton("Extraer");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pesos = Integer.parseInt((String)comboDinero.getSelectedItem());
				String cuenta = (String)comboCuenta.getSelectedItem();
				if(pesos < 200 && cuenta.equals("Caja de Ahorro")){
					label3.setText("Extracción Correcta");
				} else {
					label3.setText("No tiene permitido realizar esa extracción");
				}
				if(pesos < 400 && cuenta.equals("Cuenta Corriente")){
					label3.setText("Extracción Correcta");
				} else {
					label3.setText("No tiene permitido realizar esa extracción");
				}
			}
		});
		boton.setBounds(27, 194, 89, 23);
		contentPane.add(boton);
		
		JComboBox comboDinero = new JComboBox();
		comboDinero.setModel(new DefaultComboBoxModel(new String[] {"0", "50", "150", "200", "250", "300", "350", "400", "450", "500"}));
		comboDinero.setBounds(27, 65, 77, 20);
		contentPane.add(comboDinero);
		
		JComboBox comboCuenta = new JComboBox();
		comboCuenta.setModel(new DefaultComboBoxModel(new String[] {"Caja de Ahorro", "Cuenta Corriente"}));
		comboCuenta.setBounds(258, 65, 122, 20);
		contentPane.add(comboCuenta);
	}

}
