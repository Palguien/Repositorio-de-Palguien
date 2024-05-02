import java.util.Scanner;
//switch
public class Switch {
	public static void main(String[] args) {
		int day;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter int (day of the week)");
		day = keyboard.nextInt();
		keyboard.close();
		switch(day) {
			case 1: 
				System.out.println("Monday"); 
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday"); 
				break;
			case 5:
				System.out.println("Friday"); 
				break;
			case 6:
			case 7:
				System.out.println("Weekend");
			default:
				System.err.println("Very funny. Well you don't deserve an answer. Go fuck yourself!");
				System.err.println("asshole...");
		}
	}
}
