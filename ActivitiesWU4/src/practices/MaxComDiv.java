package practices;
import java.util.Scanner;
public class MaxComDiv {
	public static void main(String[] args) {
		int num1, num2, aux, mcd=-1, divisor;
		Scanner keyboard = new Scanner(System.in);
		do {	//Validation of the first number
			System.out.println("Introduce a positive number");
			num1=keyboard.nextInt();
		}while(num1<1);
		do {	//Validation of the second number
			System.out.println("Introduce another positive number");
			num2=keyboard.nextInt();
		}while(num2<1);
		keyboard.close();	//Close keyboard
		if(num2>num1) {		//if num2 is greater than num1 I exchange their values
			aux=num1;
			num1=num2;
			num2=aux;
		}
		divisor=num2;		//divisor begins as num2, the lower of the numbers
		while(mcd==-1) {	//until we find the mcd (worst case it will be 1) we repeat the loop, reducing divisor by 1 each time
			if(num1%divisor==0 && num2%divisor==0) {	//if both numbers are divisible by divisor, then divisor is the mcd
				mcd=divisor;
			}
			divisor--;
		}
		System.out.println("MCD = "+mcd);	//Output
	}
}
