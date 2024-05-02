package a;

import java.util.Scanner;

public class Act7 {

	public static void main(String[] args) {
		int entrada;
		System.out.println("Input an integer");
		entrada=entradaInt();
		tablaMult(entrada);
	}
	
	private static int entradaInt() {
		int input;
		Scanner keyboard = new Scanner(System.in);
		input=keyboard.nextInt();
		keyboard.close();
		return input;
	}
	
	private static void tablaMult(int entrada) {
		System.out.println("Tabla del "+entrada);
		System.out.println("-------------------");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i+" x "+entrada+" = "+i*entrada);	
		}	
	}
}
