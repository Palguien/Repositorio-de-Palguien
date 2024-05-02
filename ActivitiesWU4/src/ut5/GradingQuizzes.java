package ut5;

import java.util.Scanner;

public class GradingQuizzes {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		@SuppressWarnings("unused")
		int answers[], key[];
		int questions;
		int num, cont;
		@SuppressWarnings("unused")
		char carac;
		String cadena;
		System.out.println("How many questions are in the quiz");
		questions = keyboard.nextInt();
		answers=new int[questions];
		key=new int[questions];
		do {
			System.out.println("Input the key answer to the questions.(In one line)");
			cadena=keyboard.nextLine();
			cont=1;
			num=0;
			for(int i=0;i<cadena.length();i++) {
				if((cadena.charAt(i)<48 || cadena.charAt(i)>57) && cadena.charAt(i)!=32) {
					System.out.println("Error. Wrong caracter detected. Try again.");
					break;
				}
				if(cadena.charAt(i)==' ') {
					num=0;
					cont++;
				}else {
					num=num*10+cadena.charAt(i)-48;
				}
				System.out.println(num);
			}	
		}while(cont!=questions);	//Si no hay suficientes o hay demasiados números en la entrada, pedimos otra
		
		keyboard.close();
		System.out.println("exit");
	}

}
