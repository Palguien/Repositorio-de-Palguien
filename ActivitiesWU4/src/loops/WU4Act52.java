package loops;
import java.util.Scanner;
/*Write a program that asks for 10 numbers that are not between 10 and 50. If the number that is inserted
 * does not meet this, an error message will be displayed and the program will terminate. If it does, the
 * average of the positive numbers entered will be displayed. In addition, it should display a message 
 * indicating if any negative numbers have been entered.
 */
public class WU4Act52 {
	public static void main(String[] args) {
		int num=0,cont=0,positives=0,totalPositives=0;
		boolean negatives = false;
		Scanner keyboard = new Scanner(System.in);
		while(cont<10 && !(num<50 && num>10)) {
			System.out.println("Input a number outside the range (10,50)");
			num = keyboard.nextInt();
			if(num<0) {
				negatives=true;
			}else {
				positives++;
				totalPositives=totalPositives+num;
			}
			cont++;		
		}
		keyboard.close();
		if(cont<10) {
			System.out.println("Error");
			System.out.println("Average of positives = "+(float)totalPositives/(float)positives);
		}
		if(negatives) {
			System.out.println("Negatives detected");
		}
	}
}
