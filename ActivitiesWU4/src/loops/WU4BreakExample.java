package loops;

import java.util.Scanner;

public class WU4BreakExample {
	public static void main(String[] args) {
		int num, neg=0, pos=0;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Give number");
			num=keyboard.nextInt();
			if(num==666) {
				continue;
			}
			if(num<0) {
				neg++;
			}else {
				pos++;
			}
		}while(num!=0);
		keyboard.close();
		System.out.println("Positives="+pos);
		System.out.println("Negatives="+neg);
	}
}
