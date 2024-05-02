package loops;

import java.util.Scanner;

public class WU4Act24 {
	public static void main(String[] args) {
		int num=1;
		int cont=0, total=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a number (0 to terminate)");
		num=keyboard.nextInt();
		while(num!=0) {
			total = total+num;
			System.out.println("Input a number (0 to terminate)");
			num=keyboard.nextInt();
			cont++;
		}
		keyboard.close();
		if(cont!=0) {
			System.out.println("Average: "+(float)total/(float)cont);
		}else {
			System.out.println("No hay nada");
		}
	}		
}
