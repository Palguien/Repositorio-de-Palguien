package strings;

import java.util.Scanner;

public class Act6 {

	public static void main(String[] args) {
		String cadena1,cadena2;
		int loops;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("¿Cuántas comparaciones quieres hacer?");
		loops=keyboard.nextInt();
		keyboard.nextLine();
		for (int i = 0; i < loops; i++) {
			System.out.println("--- Comparación "+i+" ---");
			System.out.println("Cadena 1:");
			cadena1=keyboard.nextLine();
			System.out.println("Cadena 2:");
			cadena2=keyboard.nextLine();
			if(cadena1.equals(cadena2)) {
				System.out.println("Son iguales");
			}else {
				System.out.println("No son iguales");
			}
		}
		keyboard.close();

	}

}
