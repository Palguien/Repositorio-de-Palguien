package loops;
import java.util.Scanner;
//while
public class WU4Act23 {
	public static void main(String[] args) {
		final int LIMIT = 10;
		int cont = 0;
		int age;
		int total = 0;
		Scanner keyboard = new Scanner(System.in);
		while(cont<LIMIT){
			System.out.print("Input the number "+(cont+1)+": ");
			age = keyboard.nextInt();
			total = total + age;	
			cont=cont+1;
		}
		keyboard.close();
		System.out.println("Average: "+(float)total/(float)LIMIT);
	}
}