package strings;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		String cadena;
		int vowels = 0;
		Scanner keyboard = new Scanner(System.in);
		cadena=keyboard.nextLine();
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)=='a' || cadena.charAt(i)=='A' || cadena.charAt(i)=='e' || cadena.charAt(i)=='E' || 
					cadena.charAt(i)=='i' || cadena.charAt(i)=='I' || cadena.charAt(i)=='o' || cadena.charAt(i)=='O' || 
					cadena.charAt(i)=='u' || cadena.charAt(i)=='U'){
				vowels++;
			}
		}
		keyboard.close();
		System.out.println("Vowels = "+vowels);
	}

}
