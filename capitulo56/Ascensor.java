package capitulo56;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ascensor extends JFrame {

	private JPanel contentPane;
	private JLabel l1;
	private JLabel l2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascensor frame = new Ascensor();
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
	public Ascensor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pisoactual=Integer.parseInt(l1.getText());
				if(1<pisoactual)
					l2.setText("Piso actual");
				else
					l2.setText("Piso actual");
				l1.setText("1");
			}
		});
		b1.setBounds(26, 189, 51, 40);
		contentPane.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pisoactual=Integer.parseInt(l1.getText());
				if(2<pisoactual)
					l2.setText("Baja");
				else
					if(2>pisoactual)
						l2.setText("Sube");
					else
						l2.setText("Piso actual");
				l1.setText("2");
					
			}
		});
		b2.setBounds(26, 127, 51, 40);
		contentPane.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pisoactual = Integer.parseInt(l1.getText());
				if(3<pisoactual)
					l2.setText("Baja");
				else
					if(3>pisoactual)
						l2.setText("Sube");
					else
						l2.setText("Piso actual");
				l1.setText("3");
			}
		});
		b3.setBounds(26, 76, 51, 40);
		contentPane.add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pisoactual=Integer.parseInt(l1.getText());
				if(4>pisoactual)
					l2.setText("Sube");
				else
					l2.setText("Piso actual");
				l1.setText("4");
			}
		});
		b4.setBounds(26, 25, 51, 40);
		contentPane.add(b4);
		
		JLabel lblNewLabel = new JLabel("piso");
		lblNewLabel.setBounds(146, 38, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(146, 140, 77, 14);
		contentPane.add(lblDireccion);
		
		l1 = new JLabel("1");
		l1.setBounds(309, 38, 46, 14);
		contentPane.add(l1);
		
		l2 = new JLabel("baja");
		l2.setBounds(309, 140, 77, 14);
		contentPane.add(l2);
	}
}
