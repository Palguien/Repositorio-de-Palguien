package modelos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelExterno;
	private JTextField buscadorCont;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelExterno = new JPanel();
		panelExterno.setBackground(Color.ORANGE);
		panelExterno.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelExterno);
		panelExterno.setLayout(null);
		
		JLabel buscadorLabel = new JLabel("Código:");
		buscadorLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buscadorLabel.setBounds(10, 11, 64, 23);
		panelExterno.add(buscadorLabel);
		
		buscadorCont = new JTextField();
		buscadorCont.setBounds(69, 14, 86, 20);
		panelExterno.add(buscadorCont);
		buscadorCont.setColumns(10);
		
		JButton Boton = new JButton("BUSCAR");
		Boton.addActionListener(new ElEscuchador() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Boton.setBounds(335, 227, 89, 23);
		panelExterno.add(Boton);
		
		JPanel panelInterno = new JPanel();
		panelInterno.setBounds(20, 45, 292, 205);
		panelExterno.add(panelInterno);
		panelInterno.setLayout(null);
		
		JLabel nombreLabel = new JLabel("Nombre: ");
		nombreLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombreLabel.setBounds(10, 30, 59, 20);
		panelInterno.add(nombreLabel);
		
		JLabel precioLabel = new JLabel("Precio:");
		precioLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		precioLabel.setBounds(10, 94, 59, 20);
		panelInterno.add(precioLabel);
		
		JLabel fabricanteLabel = new JLabel("Fabricante:");
		fabricanteLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fabricanteLabel.setBounds(10, 158, 77, 20);
		panelInterno.add(fabricanteLabel);
		
		textField = new JTextField();
		textField.setBounds(79, 31, 203, 20);
		panelInterno.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 95, 203, 20);
		panelInterno.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 159, 203, 20);
		panelInterno.add(textField_2);
	}
}
