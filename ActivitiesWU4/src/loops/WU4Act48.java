package loops;

import java.util.Scanner;

/*Given a value n and a value y, design a program that displays sequential numbers from 1 to n, ç
 * replacing with a * each time a multiple of y is displayed. 
 */
public class WU4Act48 {
	public static void main(String[] args) {
		int lim, valueY;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give an integer to reach");
		do {
			lim = keyboard.nextInt();
		}while(lim<1);
		System.out.println("Give an integer to check its multiples");
		do{
			valueY = keyboard.nextInt();
		}while(valueY<1);
		for(int i=1;i<=lim;i++) {
			if(i%valueY==0) {
				System.out.println("*");
			}else {
				System.out.println(i);
			}
		}
		keyboard.close();
	}
}
