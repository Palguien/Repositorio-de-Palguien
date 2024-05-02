package loops;

public class WU4Fibonacci {

	public static void main(String[] args) {
		int cont1=1, cont2=1, lim, aux;
		lim = 20;
		for(int i=1;i<=lim;i++) {
			System.out.println(cont1);
			aux=cont1;
			cont1=cont2;
			cont2=aux+cont2;
		}

	}

}
