package Dialogos;
import javax.swing.JOptionPane;

public class Dialogos {
	public static void main(String[] args) {
		
		//Tipos de ventanas de información según el tipo de mensaje
//		JOptionPane.showMessageDialog(null, "INFORMACIÓN","Información",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "AVISO: CUIDADO","Aviso",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "ERROR","Error",JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "¿QUÉ TAL ESTÁS?","Pregunta",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "IDEA DEL DÍA","Mensaje",JOptionPane.PLAIN_MESSAGE);
		
		//Ventana de diálogo de entrada
		
		//Entrada cadena
//		String cad;
//		String dato;
//		cad = JOptionPane.showInputDialog("Introduce cadena ");
//		JOptionPane.showMessageDialog(null, cad,"Mi programa",JOptionPane.INFORMATION_MESSAGE);
		
		//Entrada entero
//		int valor;
//		dato = JOptionPane.showInputDialog("Introduce un entero ");
//		valor=Integer.parseInt(dato);	
//		valor=valor*2;
//		JOptionPane.showMessageDialog(null, valor,"Mi programa",JOptionPane.INFORMATION_MESSAGE);
		
		//Diálogo de opciones
//		int val1;
//		val1= JOptionPane.showConfirmDialog(null, "¿Te gusta programar?");
//		System.out.println("Val1: "+val1);
//	    if(val1 == JOptionPane.YES_OPTION)
//	        JOptionPane.showMessageDialog(null, "Has elegido SÍ");
//	    else if(val1 == JOptionPane.NO_OPTION) {
//	        JOptionPane.showMessageDialog(null, "Has elegido NO.");
//	    }else if(val1== JOptionPane.CANCEL_OPTION)
//	    	JOptionPane.showMessageDialog(null, "Has cancelado.");
//			
		
	    //Diálogo de opciones personalizado	    
	    Object[] conjuntoValores = {"Pizza", "Hamburguesa", "Nachos","Brocoli"};
		Object ValoresSelec = JOptionPane.showOptionDialog(null,
		"Elige tu comida", "Entrada",JOptionPane.DEFAULT_OPTION,
		JOptionPane.INFORMATION_MESSAGE, null,
		conjuntoValores, conjuntoValores[0]);
	    
	    
	}
}
