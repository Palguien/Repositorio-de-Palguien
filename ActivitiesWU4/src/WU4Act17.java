import java.util.Scanner;

public class WU4Act17 {
	public static void main(String[] args) {
		int num;
		System.out.println("User, I demand you to give me an integer");
		Scanner keyboard = new Scanner(System.in);
		num=keyboard.nextInt();
		if(num > 0) {
			System.out.println("Positive");
		}else {
			if(num < 0) {
				System.out.println("Negative");
			}else {
				System.out.println("Zero");
			}
		}
		
		keyboard.close();
	}
}
