package strings;

import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		String cadena="abcde";
		int posit;
		boolean exit = false;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Input position:");
			posit = keyboard.nextInt();
			if(posit<0 || posit>=cadena.length()) {
				System.out.println("La posición indicada no es válida");
				exit=true;
			}else {
				System.out.println("El carácter en la posición "+posit+" es "+cadena.charAt(posit));
			}
		}while(!exit);
		keyboard.close();
		
	}

}
