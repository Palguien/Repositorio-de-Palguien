import java.util.Scanner;

//Conditionals
public class Conditionals {
	public static void main(String[] args) {
		int num = 10;
		
		Scanner keyBoard= new Scanner(System.in);
		//Ask the user for a number
		System.out.println("give me a number");
		num=keyBoard.nextInt();
		//Comparison
		if(num >= 10) {
			System.out.println("It is greater than 10");
		}else {
			System.out.println("It is lower than 10");
		}
		//end Comparison
		System.out.println("I always execute that, bye");
		
		keyBoard.close();
	}
}
