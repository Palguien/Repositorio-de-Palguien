package exceptionExample;

import java.util.Scanner;

public class ExceptionEj6 {
	
	public static void main(String[] args) {
		//int num;
		try {
			System.out.println(pedirEntero("Give me an int"));
		}catch(Exception e) {
			System.out.println("Error");
		}
	}

	private static int pedirEntero(String message) {
		int num=0;
		try {
			num=Integer.parseInt(pedirCadena(message));
		}catch(NumberFormatException e) {
			System.out.println("Letras en vez de números");
			System.exit(0);
		}
		return num;
	}

	private static String pedirCadena(String message) {
		String cadena;
		Scanner teclado = new Scanner(System.in);
		System.out.println("message");
		cadena=teclado.nextLine();
		teclado.close();
		return cadena;
	}

}
