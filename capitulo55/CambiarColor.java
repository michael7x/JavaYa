package capitulo55;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CambiarColor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambiarColor frame = new CambiarColor();
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
	public CambiarColor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnCambiarColor = new JMenu("Cambiar color");
		menuBar.add(mnCambiarColor);
		
		JMenuItem mntmRojo = new JMenuItem("rojo");
		mntmRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(Color.red);
			}
		});
		mnCambiarColor.add(mntmRojo);
		
		JMenuItem mntmVerde = new JMenuItem("verde");
		mntmVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(Color.green);
			}
			
		});
		mnCambiarColor.add(mntmVerde);
		
		JMenuItem mntmAzul = new JMenuItem("azul");
		mntmAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(Color.blue);
			}
		});
		mnCambiarColor.add(mntmAzul);
	}
}
