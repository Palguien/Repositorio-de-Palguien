package loops;
import java.util.Scanner;
/* Ask for 5 student grades and say at the end if there are any failures. 
 * Validate that the user enters valid grades.
 */
public class WU4Act42 {
	public static void main(String[] args) {
		final int NUM_GRADES = 5;
		float grade;
		boolean failures = false;
		Scanner keyboard = new Scanner(System.in);
		for(int i=1;i<=NUM_GRADES;i++) {
			do {
				System.out.println("Input grade "+i);
				grade = keyboard.nextFloat();
			}while(grade<0 || grade>10);
			if(grade<5) {
				failures = true;
			}
		}
		keyboard.close();
		if(failures) {
			System.out.println("There are failures");
		}else {
			System.out.println("There are not failures");
		}
	}
}
