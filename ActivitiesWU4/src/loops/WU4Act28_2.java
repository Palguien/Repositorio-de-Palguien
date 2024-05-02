package loops;
import java.util.Scanner;
//Multiplication table
public class WU4Act28_2 {
	public static void main(String[] args) {
		int num;
		System.out.print("Multiplication table of: ");
		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+num*i);			
		}
		keyboard.close();
	}
}
