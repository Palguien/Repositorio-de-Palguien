package loops;

import java.util.Scanner;

//Ask for 10 numbers, and show at the end if you have entered any greater than 8.
public class WU4Act46 {

	public static void main(String[] args) {
		final int LOOPS = 10, LIM = 8;
		int number;
		boolean greater = false;
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<LOOPS;i++) {
			System.out.println("Enter int "+(i+1));
			number = keyboard.nextInt();
			if(number>LIM) {
				greater = true;
			}
		}
		keyboard.close();
		if(greater) {
			System.out.println("Detected number greater than "+LIM);
		}
		System.out.println("End of the program");
	}

}
