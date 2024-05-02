package dialogs;

import javax.swing.JOptionPane;
/**
 * Dialogs para importar y referencia rápida
 * @author Pablo
 */
public class EasyDialogs extends JOptionPane{
	/**
	 * Cosa rara no mirar por ahora
	 */
	private static final long serialVersionUID = 1L;
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
	/**
	 * muestra una ventana de Confirmación
	 * @param message	mensaje que muestra la ventana de Confirmación
	 */
	public static void confirmationDialog(String message) {
		JOptionPane.showInternalConfirmDialog(null, message, "CONFIRMATION", JOptionPane.YES_NO_OPTION);
	}
	/**
	 * muestra una ventana de Confirmación
	 * @param message	mensaje que muestra la ventana de Confirmación
	 * @param titulo	titulo de la ventana de Confirmación
	 */
	public static void confirmationDialog(String message, String title) {
		JOptionPane.showInternalConfirmDialog(null, message, title, YES_NO_OPTION);
	}
}
