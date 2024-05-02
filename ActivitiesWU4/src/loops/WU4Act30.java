package loops;
import java.util.Scanner;
//Asks for 6 numbers and outputs the total
public class WU4Act30 {
	public static void main(String[] args) {
		double num;
		double total=0;
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.println("Enter a number:");
			num=keyboard.nextInt();
			total=total+num;
		}
		System.out.println("Total = "+total);
		keyboard.close();
	}

}
