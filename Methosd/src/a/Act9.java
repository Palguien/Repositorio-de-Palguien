package a;

public class Act9 {

	public static void main(String[] args) {
		int num1=3,num2=6;
		printIntervalo(num1,num2);
		System.out.println("End");
	}

	private static void printIntervalo(int num1, int num2) {
		int aux;
		if(num1>num2) {
			aux=num1;
			num1=num2;
			num2=aux;
		}
		System.out.println("["+num1+","+num2+"]");
		for (int i = num1; i <=num2; i++) {
			System.out.println(i);
		}
		
	}

}
