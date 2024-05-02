package a;

public class Act4 {

	public static void main(String[] args) {
		int numero=5;
		sumatorio(numero);

	}

	private static void sumatorio(int numero) {
		int sum=0;
		for (int i = 1; i <= numero; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
