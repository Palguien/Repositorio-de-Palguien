package loops;

import java.util.Scanner;

/*Given 6 grades, write the number of passing, 
 * conditional (=4) and failing students. 
 */
public class WU4Act45 {
	public static void main(String[] args) {
		final int LIM = 6;
		int passing=0,conditional=0, failing=0, grade;
		Scanner keyboard = new Scanner(System.in);
		for(int i=1;i<=LIM;i++) {
			do {
				System.out.println("Grade "+i);
				grade = keyboard.nextInt();
			}while(grade<0 || grade>10);
			switch(grade) {
			case 4:
				conditional++;
			case 0,1,2,3:
				failing++;
				break;
			default:
				passing++;
			}
			
		}
		keyboard.close();
		System.out.println("passing = "+passing);
		System.out.println("conditional = "+conditional);
		System.out.println("failing = "+failing);

	}

}
