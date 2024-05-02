package methods;

public class tutorial {

	public static void main(String[] args) {
		int num1=3,num2=4;
		System.out.println("Numero 1 = "+numero(num1));
		System.out.println("Numero 2 = "+numero(num2));
		resultado(suma(numero(num1),numero(num2)));
	}
	public static int numero(int a) {
		return a;
	}
	public static int suma(int a, int b) {
		return a+b;	
	}
	public static void resultado(int a) {
		System.out.println("La suma es "+a);
		
	}

}
