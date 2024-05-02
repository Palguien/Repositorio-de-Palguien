package strings;

import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		String cadena;
		char buscado = 'j';
		int count = 0;
		Scanner keyboard = new Scanner(System.in);
		cadena=keyboard.nextLine();
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)==buscado){
				count++;
			}
		}
		keyboard.close();
		System.out.println("Carácter "+buscado+" = "+count);
	}

}
