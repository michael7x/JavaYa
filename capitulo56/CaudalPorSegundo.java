 package capitulo56;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CaudalPorSegundo extends JFrame {

	private JPanel contentPane;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JLabel l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaudalPorSegundo frame = new CaudalPorSegundo();
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
	public CaudalPorSegundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner1 = new JSpinner();
	    spinner1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner1.setBounds(25, 23, 65, 20);
		contentPane.add(spinner1);
		
		spinner2 = new JSpinner();
		spinner2.setBounds(25, 77, 65, 20);
		contentPane.add(spinner2);
		
		spinner3 = new JSpinner();
		spinner3.setBounds(25, 137, 65, 20);
		contentPane.add(spinner3);
		
		JLabel labelCompueta = new JLabel("Compuerta 1");
		labelCompueta.setBounds(131, 26, 134, 14);
		contentPane.add(labelCompueta);
		
		JLabel lblCompuerta_1 = new JLabel("Compuerta 2");
		lblCompuerta_1.setBounds(131, 80, 116, 14);
		contentPane.add(lblCompuerta_1);
		
		JLabel lblCompuerta_2 = new JLabel("Compuerta 3");
		lblCompuerta_2.setBounds(131, 143, 116, 14);
		contentPane.add(lblCompuerta_2);
		
		l1 = new JLabel("resultado");
		l1.setBounds(229, 218, 96, 14);
		contentPane.add(l1);
		
		JButton btnNewButton = new JButton("Actualizar Caudal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int v1 = Integer.parseInt(spinner1.getValue().toString());
				int v2 = Integer.parseInt(spinner2.getValue().toString());
				int v3 = Integer.parseInt(spinner3.getValue().toString());
				int suma = v1 + v2 +v3;
				if(suma <= 100)
					l1.setText("Bajo");
				else
					if(suma<=200)
						l1.setText("Medio");
					else
						l1.setText("Alto");		
			}
			
			
		});
		btnNewButton.setBounds(25, 214, 154, 23);
		contentPane.add(btnNewButton);		
	}
}
