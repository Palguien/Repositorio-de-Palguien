package loops;
import java.util.Scanner;
//Write a program that asks for 10 numbers, displaying at the end 
//of the program a message indicating if it has read any negative numbers.
public class WU4Act39 {
	public static void main(String[] args) {
		final int LIM = 10;
		boolean neg = false;
		int num;
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<LIM;i++) {
			System.out.println("enter integer:");
			num=keyboard.nextInt();
			if(num<0) {
				neg=true;
			}
		}	
		if(neg==true) {
			System.out.println("negatives read");
		}else {
			System.out.println("no negatives read");
		}
		keyboard.close();
	}
}
