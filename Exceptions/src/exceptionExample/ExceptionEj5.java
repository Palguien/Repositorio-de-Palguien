package exceptionExample;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionEj5 {

	public static void main(String[] args) {
		String dividend, divisor;
		// float result;
		int result, fallos = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			try {
				System.out.println("mete un dividendo");
				dividend = teclado.nextLine();
				System.out.println("mete un divisor");
				divisor = teclado.nextLine();

				result = Integer.parseInt(dividend) / Integer.parseInt(divisor);
				System.out.println("result=" + result);
				
				if(!(JOptionPane.showConfirmDialog(null, "Do you want to continue")==JOptionPane.YES_OPTION)) {
					fallos=-1;
				}
				
			} catch (ArithmeticException e) {
				System.out.println("Dividing by 0, exiting");
				fallos = 4;
			} catch (NumberFormatException e) {
				System.out.println("Letters instead of numbers");
				fallos++;
			} catch (Exception e) {
				System.out.println("There are some problems");
			} finally { // it executes always
				System.out.println("finally clause");
			}
		} while (fallos < 3 && fallos != -1);

		if (fallos == 3) {
			System.out.println("We closed the program. There are too many wrong entries.");
		}
		System.out.println("End of program");
		teclado.close();
	}

}
