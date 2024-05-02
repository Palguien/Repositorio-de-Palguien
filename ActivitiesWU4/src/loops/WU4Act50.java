package loops;

import java.util.Scanner;

/*Write a program that asks for a number and displays the sum of all odd numbers 
 * from 1 to this number (including this one). The number read has to be positive,
 * so if it is not, it will ask for another one until it is.
 */
public class WU4Act50 {
	public static void main(String[] args) {
		int lim, total=0;
		Scanner keyboard = new Scanner(System.in);
		do{
			System.out.println("Give a positive number");
			lim=keyboard.nextInt();
		}while(lim<1);
		keyboard.close();
		for(int i=1;i<=lim;i=i+2) {
			total=total+i;
		}
		System.out.println("Sum of all odd numbers until "+lim+" = "+total);
		}
}
