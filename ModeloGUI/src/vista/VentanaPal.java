package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelos.Modelo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaPal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton buscarBtn;
	JPanel panel;
	JLabel LabelResultado;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaPal frame = new VentanaPal();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public VentanaPal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		buscarBtn = new JButton("Buscar");
		
		//codigo para controlador
		buscarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modelo mod = new Modelo();
				LabelResultado.setText(mod.aleatoria());
			}
		});
		
		contentPane.add(buscarBtn, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		LabelResultado = new JLabel("New label");
		panel.add(LabelResultado);
	}

}
