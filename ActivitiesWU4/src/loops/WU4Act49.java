package loops;

import java.util.Scanner;

/*Write a program that asks for two numbers. If the two numbers given are the same,
 *  a message informing you of this will be displayed and two more numbers will be 
 *  requested again. So on, until two numbers are inserted that are different from
 *   each other. Of these two numbers, the larger one will be displayed.
 */
public class WU4Act49 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give 2 numbers");
		num1=keyboard.nextInt();
		num2=keyboard.nextInt();
		while(num1==num2){
			System.out.println("Equal numbers detected");
			System.out.println("Give 2 new numbers");
			num1=keyboard.nextInt();
			num2=keyboard.nextInt();
		}
		keyboard.close();
		System.out.println("Different numbers detected");
		if(num1>num2) {
			System.out.println(num1+" is bigger");
		}else {
			System.out.println(num2+" is bigger");
		}
			
		

	}

}
