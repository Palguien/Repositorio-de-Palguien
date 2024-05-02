package loops;

import java.util.Scanner;

public class WU4Triangle {
	public static void main(String[] args) {
		int cont,base;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Base (positivo impar): ");
			base=keyboard.nextInt();
		}while(base<1 || base%2==0);
		keyboard.close();
		for(int i=1;i<=base;i=i+2) {
			cont = 0;
			do{
				for(int j=0;j<(base-i)/2;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				for(int j=0;j<(base-i)/2;j++) {
					System.out.print(" ");
				}
				System.out.println();
				cont++;
			}while(cont<2 && i!=base);
		}
		for(int i=0;i<base/2;i++) {
			for(int j=0;j<(base-1)/2;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=0;j<(base-1)/2;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
