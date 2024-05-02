package loops;

import java.util.Scanner;

/*Write a program that reads several characters until an asterisk is entered. You have to visualize 
 * how many of the characters read were between the capital letters 'I' and 'P', both inclusive.
 */
public class WU4Act51 {
	public static void main(String[] args) {
		char character;
		int inRange = 0;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Input a char ('*' to exit)");
			character = keyboard.next().charAt(0);
			if(character>='I' && character<='P') {
				inRange++;
			}
		}while(character!='*');
		keyboard.close();
		System.out.println("In range [I,P] there has been introduced "+inRange+" characters.");
	}
}
