package loops;

import java.util.Scanner;

public class WU4Act38 {
	public static void main(String[] args) {
		int hours;
		int exit;
		boolean end = false;
		Scanner keyboard = new Scanner(System.in);
		while(!end) {		
			do {
				System.out.println("Enter weekly hours (>0): ");
				hours=keyboard.nextInt();
			}while(hours<0 || hours>(7*24));
			if(hours>35) {
				System.out.println("money = "+(35*15+(hours-35)*22)+" euros");
			}else {
				System.out.println("money = "+(hours*15)+" euros");
			}
			System.out.println("To exit press '0'");
			exit=keyboard.nextInt();
			if(exit==0) {
				end=true;
			}
		}
		System.out.println("Ending execution");
		keyboard.close();
	}
}
