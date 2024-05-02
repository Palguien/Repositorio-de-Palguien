package JOptionPane;
import javax.swing.*;

public class Dialogos2 {
	public int pedirEntero(String mensaje){
		try {
			String ax = JOptionPane.showInputDialog(mensaje);
			int valor=Integer.parseInt(ax);
			return valor;
			
		}
		catch(NumberFormatException ex) {
			this.mensajeError("Error de tipo de dato","Aplicación de Cris");
		}
		catch(Exception e) {
			this.mensajeError("ERROR GRAVE","Aplicación de Cris");
		}
		return 0;
	}

	public float pedirFloat (String mensaje) {
		try {
			String ax = JOptionPane.showInputDialog(mensaje);
			float valor=Float.parseFloat(ax);
			return valor;
			
		}catch(NumberFormatException ex) {
			this.mensajeError("Error de tipo de dato","Aplicación de Cris");
		}
		catch(Exception e) {
			this.mensajeError("ERROR GRAVE","Aplicación de Cris");
		}
		return 0;
	}	

	public double pedirDouble (String mensaje) {
		try {
			String ax = JOptionPane.showInputDialog(mensaje);
			double valor=Double.parseDouble(ax);
			return valor;
			
		}catch(NumberFormatException ex) {
			this.mensajeError("Error de tipo de dato","Aplicación de Cris");
		}
		catch(Exception e) {
			this.mensajeError("ERROR GRAVE","Aplicación de Cris");
		}
		return 0;
	}	
	public void mensajeWarning(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje,"título",JOptionPane.WARNING_MESSAGE);
	}
	
	public void mensajeWarning(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
	}
	
	public void mensajeInfo(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje,"título",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mensajeInfo(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mensajeError(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje,"título",JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensajeError(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
	public int confirmaDialogo(String pregunta) {
		int respuesta=0;
		respuesta=JOptionPane.showConfirmDialog(null, pregunta);
		return(respuesta);
	}

}
