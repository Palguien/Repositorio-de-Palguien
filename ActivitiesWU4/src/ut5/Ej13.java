package ut5;

import java.util.Scanner;

/*Escribe un programa que pida una clave y que vuelva a pedir dicha clave para comprobar que se ha
 * indicado bien. Si no coinciden dichas claves, se visualizará un mensaje de error y se volverá a
 *  pedir de nuevo dicha clave. Se distinguirá entre las mayúsculas y las minúsculas.
 * 
 */
public class Ej13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String password, comprobation;
		boolean iguales;
		do {
			iguales=true;
			System.out.println("Enter new password");
			password=keyboard.nextLine();
			System.out.println("Repeat new password");
			comprobation=keyboard.nextLine();
			if(password.length()!=comprobation.length()) {
				iguales=false;
			}else {
				for (int i = 0; i < password.length(); i++) {
					if(password.charAt(i)!=comprobation.charAt(i)) {
						iguales=false;
					}
				}
			}
			if(!iguales) {
				System.out.println("ERROR. Different passwords entered. Try again.");
			}
		}while(!iguales);
		System.out.println("Ending execution");
		keyboard.close();

	}

}
