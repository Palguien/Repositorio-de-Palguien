package loops;
import java.util.Scanner;
/*Play a game to guess a number. To do this, ask for a number N, and then ask for 
 * numbers indicating "greater" or "lesser" depending on whether it is greater or 
 * lesser with respect to N. The process ends when the user guesses correctly.
 */
public class WU4Act40_1 {
	public static void main(String[] args) {
		int num, guess, tries = 0;
		Scanner keyboard = new Scanner(System.in);
		num = (int) (Math.random()*100-50);
		System.out.println(num);
		do {
			tries++;
			System.out.println("Try "+tries+":");
			guess = keyboard.nextInt();
			if(guess!=num) {
				if(guess>num) {
					System.out.println("Greater");
				}else {
					System.out.println("Lesser");
				}		
			}
		}while(guess!=num);
		keyboard.close();
		System.out.println("You got it right.");
	}
}
