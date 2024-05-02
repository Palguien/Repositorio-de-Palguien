package strings;

import java.util.Scanner;

public class Act7 {

	public static void main(String[] args) {
		String cadena1,cadena2;
		int loops;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("¿Cuántas comparaciones quieres hacer?");
		loops=keyboard.nextInt();
		keyboard.nextLine();
		for (int i = 1; i <= loops; i++) {
			System.out.println("--- Comparación "+i+" ---");
			System.out.println("Cadena 1:");
			cadena1=keyboard.nextLine();
			System.out.println("Cadena 2:");
			cadena2=keyboard.nextLine();
			if(cadena1.compareTo(cadena2)==0) {
				System.out.println("Son iguales");
				System.out.println(cadena1+"  "+cadena2);
			}else{
				System.out.println("No son iguales");
				if(cadena1.compareTo(cadena2)>0) {
					System.out.println(cadena2+"  "+cadena1);
				}else {
					System.out.println(cadena1+"  "+cadena2);
				}
			}
		}
		keyboard.close();

	}

}
