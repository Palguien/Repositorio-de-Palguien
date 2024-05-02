package exceptionExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		int dividend,divisor;
		//float result;
		int result;
		Scanner teclado = new Scanner(System.in);

		try {
		System.out.println("mete un dividendo");
		dividend=teclado.nextInt();
		teclado.nextLine();
		System.out.println("mete un divisor");
		divisor=teclado.nextInt();
		teclado.nextLine();
		
		result=dividend/divisor;
		System.out.println("result="+result);
		teclado.close();
		
		}catch(ArithmeticException e) {
			System.out.println("Dividing by 0");
		}catch(InputMismatchException e) {
			System.out.println("Letters instead of numbers");
		}catch(Exception E) {
			System.out.println("There are some problems");
		}finally {	//it executes always
			System.out.println("finally clause");
		}
			
		System.out.println("End of program");
	}

}
