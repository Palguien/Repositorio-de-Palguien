package loops;

import java.util.ArrayList;
import java.util.Scanner;

public class WU4Bingo {

	public static void main(String[] args) {
		int num, lim=75, cont=0;
		ArrayList<Integer> numCantados = new ArrayList<Integer>(75);
		char linea;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("--- BINGO ---");
		numCantados.add(0);	//Eliminating the 0
		do {
			do {
				num=(int)(Math.random()*75);
			}while(numCantados.contains(num));
			System.out.println(num);
			numCantados.add(num);	
			do {
				System.out.println("Linea(Y/N)");
				linea = keyboard.next().charAt(0);
			}while(linea!='Y' && linea!='N');
			cont++;
		}while(linea!='Y' && cont<lim);
		keyboard.close();
	}
}
