package loops;

import java.util.Scanner;

public class WU4Act34 {
	public static void main(String[] args) {
		int year, month;
		Scanner keyboard = new Scanner(System.in);
		do{
			System.out.println("Year: ");	
			year=keyboard.nextInt();
		}while(year<1583);
		do{
			System.out.println("Month (>1583): ");
			month=keyboard.nextInt();
		}while(month>12 || month<1);
		switch(month) {
		case 2:
			if(year%400==0 || (year%4==0 && year%100!=0)) {
				System.out.println("Days of the month = 29");
			}else {
				System.out.println("Days of the month = 28");
			}
			break;
		case 4,6,9,11:
			System.out.println("Days of the month = 30");
			break;
		case 1,3,5,7,8,10,12:
			System.out.println("Days of the month = 31");
		}
		keyboard.close();
	}
}
