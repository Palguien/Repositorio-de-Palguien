import java.util.Scanner;

public class WU4Act22 {
	public static void main(String[] args) {
		int number1, number2; 
		char numOperation;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Bienvenido al servicio de operaciones.");
		System.out.println("Introduce 2 enteros para operar.");
		number1 = keyboard.nextInt();
		number2 = keyboard.nextInt();
		System.out.println("En caso de querer multiplicar pulsa 1. En caso de querer sumar pulsa 2. En caso de querer restar pulsa 3.");
		System.out.println("En caso de querer dividir pulsa 4 o 5. En caso de querer reportar una incidencia pulsa 6.");
		numOperation = keyboard.next().charAt(0);
		keyboard.close();
		switch(numOperation) {
		case '1':
			System.out.println("Result = "+(number1*number2));
			break;
		case '2':
			System.out.println("Result = "+(number1+number2));
			break;
		case '3':
			System.out.println("Result = "+(number1-number2));
			break;
		case '4':
		case '5':
			if(number2!=0) {
				System.out.println("Result = "+(number1/number2));
				System.out.println("Remainder = "+(number1%number2));
			}else {
				System.out.println("Math Error");
				System.err.println("¡YO LO MATO!¡PORQUE ME ESTÁ AGARRANDO EL COMPILADOR, QUE SI NO LE HAGO ASÍN Y LO MATO!");
			}
			break;
		case '6':
			System.err.println("Hahaha! Got'em.");
			break;
		default:
			System.out.println("Unknown command");
			System.err.println("Asshole");
		}
		System.out.println("Thanks for using our services");

	}
}
