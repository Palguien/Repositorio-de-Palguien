package modelos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaPal;

public class Controlador implements ActionListener{
	VentanaPal ventana;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Modelo mod = new Modelo();
		ventana.LabelResultado.setText(mod.aleatoria());
		
	}

}
