import java.util.Scanner;
//tell the lower of the three integers
public class WU4Act18 {
	public static void main(String[] args) {
		int num1,num2,num3, min;
		System.out.println("User, bestow upon me integers three.");
		Scanner keyboard = new Scanner(System.in);
		num1=keyboard.nextInt();
		num2=keyboard.nextInt();
		num3=keyboard.nextInt();
		keyboard.close();
		
		if(num1<num2) {
			min = num1;
		}else {
			min = num2;
		}
		if(num3 < min) {
			min = num3; 
		}
		System.out.println("Therefore the lower is "+ min);
	}
}
