import java.util.Scanner;

//Input by using Scanner
public class CosaDeScanner {
	public static void main(String[] args) {
		int age;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your age ");
		//until space
		age=keyboard.nextInt();
		System.out.println("The inserted age is: ");
		System.out.println("AGE: "+age);
		System.out.println("End of program");
		keyboard.close();
	}
}
