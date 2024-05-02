package loops;
import java.util.Scanner;
//Asks for how many numbers will the loop ask for, the calculates the average and detects if any even was inputed
public class WU4Act31 {
	public static void main(String[] args) {
		int number, numberOfNumbers;
		double total = 0;
		boolean even = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many numbers do you want to input?");
		numberOfNumbers = keyboard.nextInt();
		for (int i = 1; i <= numberOfNumbers; i++) {
			System.out.println("Number " + i + ": ");
			number = keyboard.nextInt();
			total = total + number;
			if (even == false && number % 2 == 0) {
				even = true;
			}
		}
		keyboard.close();
		if (even == true) {
			System.out.println("Even detected.");
		}
		System.out.println("Average = " + total / numberOfNumbers);
	}
}
