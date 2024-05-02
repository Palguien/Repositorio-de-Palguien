package dialogs;

import javax.swing.JOptionPane;
/**
 * Dialogs para importar y referencia rápida
 * @author Pablo
 */
public class Dialogs {
	/**
	 * Constante YES
	 */
	public static final int YES=JOptionPane.YES_OPTION;
	/**
	 * Constante NO
	 */
	public static final int NO=JOptionPane.NO_OPTION;
	/**
	 * Constante CANCEL
	 */
	public static final int CANCEL=JOptionPane.CANCEL_OPTION;
	/**
	 * Pide y recibe un entero del usuario
	 * @param message	mensaje que saldra por pantalla
	 * @return int	
	 * @throws NumberFormatException si el usuario introduce letras
	 */
	public static int askIntDialog(String message) {
		String auxStr=(JOptionPane.showInputDialog(null, message, "INPUT", JOptionPane.QUESTION_MESSAGE));
		int result=0;
		try {
			result = Integer.parseInt(auxStr);
		}catch (NumberFormatException e){
			showError("Insert Integer numbers");
			throw e;
		}
		return result;
	}
	/**
	 * Pide y recibe un entero del usuario
	 * @param message	mensaje que saldra por pantalla
	 * @param title 	titulo de la ventana
	 * @return int	
	 * @throws NumberFormatException si el usuario introduce letras
	 */
	public static int askIntDialog(String message, String title) {
		String auxStr=(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
		int result=0;
		try {
			result = Integer.parseInt(auxStr);
		}catch (NumberFormatException e){
			showError("Insert Integer numbers");
			throw e;
		}
		return result;
	}
	/**
	 * Pide y recibe un float del usuario
	 * @param message	mensaje que saldra por pantalla
	 * @return float	
	 * @throws NumberFormatException si el usuario introduce letras
	 */
	public static float askFloatDialog(String message) {
		String auxStr=(JOptionPane.showInputDialog(null, message, "INPUT", JOptionPane.QUESTION_MESSAGE));
		float result=0;
		try {
			result = Float.parseFloat(auxStr);
		}catch (NumberFormatException e){
			showError("Insert Float numbers");
			throw e;
		}
		return result;
	}
	/**
	 * Pide y recibe un float del usuario
	 * @param message	mensaje que saldra por pantalla
	 * @param title 	titulo de la ventana
	 * @return float	
	 * @throws NumberFormatException si el usuario introduce letras
	 */
	public static float askFloatDialog(String message, String title) {
		String auxStr=(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
		float result=0;
		try {
			result = Float.parseFloat(auxStr);
		}catch (NumberFormatException e){
			showError("Insert Float numbers");
			throw e;
		}
		return result;
	}
	/**
	 * Pide y recibe un double del usuario
	 * @param message	mensaje que saldra por pantalla
	 * @return double	
	 * @throws NumberFormatException si el usuario introduce letras
	 */
	public static double askDoubleDialog(String message) {
		String auxStr=(JOptionPane.showInputDialog(null, message, "INPUT", JOptionPane.QUESTION_MESSAGE));
		double result=0;
		try {
			result = Double.parseDouble(auxStr);
		}catch (NumberFormatException e){
			showError("Insert Double numbers");
			throw e;
		}
		return result;
	}
	/**
	 * Pide y recibe un double del usuario
	 * @param message	mensaje que saldra por pantalla
	 * @param title 	titulo de la ventana
	 * @return double	
	 * @throws NumberFormatException si el usuario introduce letras
	 */
	public static double askDoubleDialog(String message, String title) {
		String auxStr=(JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE));
		double result=0;
		try {
			result = Double.parseDouble(auxStr);
		}catch (NumberFormatException e){
			showError("Insert Float numbers");
			throw e;
		}
		return result;
	}
	/**
	 * muestra una ventana de Confirmacion (yes/no)
	 * @param message	mensaje que muestra la ventana de Confirmacion
	 */
	public static int confirmMessage(String message) {
		return JOptionPane.showConfirmDialog(null, message, "CONFIRMATION REQUEST",JOptionPane.YES_NO_OPTION);
	}
	/**
	 * muestra una ventana de Confirmacion (yes/no/cancel)
	 * @param message	mensaje que muestra la ventana de Confirmacion
	 */
	public static int confirmCancelMessage(String message) {
		return JOptionPane.showConfirmDialog(null, message, "CONFIRMATION REQUEST",JOptionPane.YES_NO_CANCEL_OPTION);
	}
	/**
	 * Selección entre lista de opciones
	 * @param message	mensaje
	 * @param options	lista de opciones
	 * @return posicion del mensaje (int)
	 */
	public static int selectOptionMessage(String message, String[] options) {
		return JOptionPane.showOptionDialog(null, message, "SELECT", CANCEL, JOptionPane.QUESTION_MESSAGE, null, options, null);
	}
	/**
	 * Selección entre lista de opciones
	 * @param message	mensaje
	 * @param title	titulo
	 * @param options	lista de opciones
	 * @return posicion del mensaje (int)
	 */
	public static int selectOptionMessage(String message,String title, String[] options) {
		return JOptionPane.showOptionDialog(null, message, title, CANCEL, JOptionPane.QUESTION_MESSAGE, null, options, null);
	}
	
	/**
	 * muestra una ventana de Error
	 * @param message	mensaje que muestra la ventana de ERROR
	 */
	public static void showError(String message) {
		JOptionPane.showMessageDialog(null, message, "ERROR",JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * muestra una ventana de Información
	 * @param message	mensaje que muestra la ventana de Información
	 */
	public static void infoMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "INFO",JOptionPane.INFORMATION_MESSAGE);
		
	}
	/**
	 * muestra una ventana de Información
	 * @param message	mensaje que muestra la ventana de Información
	 * @param titulo	titulo de la ventana de Información
	 */
	public static void infoMessage(String message,String titulo) {
		JOptionPane.showMessageDialog(null, message, titulo,JOptionPane.INFORMATION_MESSAGE);	
	}
}
