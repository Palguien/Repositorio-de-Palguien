package modelos;
import java.awt.EventQueue;

import vista.VentanaPal;

public class App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPal frame = new VentanaPal();
					Controlador control=new Controlador(frame);
					frame.setControl(control);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
