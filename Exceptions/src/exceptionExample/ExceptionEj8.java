package exceptionExample;

import javax.swing.JOptionPane;

public class ExceptionEj8 {

	public static void main(String[] args) {
		char[] letras = {'a','b','c','d','e'};
		try {
			int pos=Integer.parseInt(JOptionPane.showInputDialog(null, "posicion array para mirar:"));
			System.out.println(letras[pos]);
		}catch(NumberFormatException e) {
			System.out.println("Letras introducodas en vez de numeros");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicion fuera de límites del array");
		}
		
	}

}
