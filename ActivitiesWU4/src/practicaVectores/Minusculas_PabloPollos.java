package practicaVectores;
import java.util.Scanner;
//Exercise 2
public class Minusculas_PabloPollos {
	public static void main(String[] args) {
		char[] cadena;
		String input;
		int contCambios=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a String");
		input = keyboard.nextLine();
		keyboard.close();
		cadena = new char[input.length()];
		//Write each character from the String in the vector 
		for(int i = 0;i<input.length();i++) {
			cadena[i]=input.charAt(i);
		}
		//Read the vector and replacing each upper case character with its correspondent lower case
		for(int i = 0;i<cadena.length;i++) {
			if(cadena[i]>= 'A' && cadena[i]<='Z') {
				cadena[i]=(char) (cadena[i]+('a'-'A'));
				contCambios++;
			}
		}
		//Read modified vector
		System.out.println("Output:");
		for(int i = 0;i<cadena.length;i++) {
			System.out.print(cadena[i]);
		}
		System.out.println("\nWe changed to lowercase "+contCambios+" characters.");
	}
}
