package a;

public class Act3 {

	public static void main(String[] args) {
		int a=2,b=-1,c=1;
		System.out.println(mayor(a,b,c));
	}
	/**
	 * Recibe 3 enteros y devuelve el mayor
	 * @param a		primer numero
	 * @param b		sugundo numero
	 * @param c		tercer numero
	 * @return mayor	mayor numero
	 */
	private static int mayor(int a, int b, int c) {
		int mayor;
		if(a>b) {
			mayor=a;
		}else {
			mayor=b;
		}
		if(c>mayor) {
			mayor=c;
		}
		return mayor;
	}

}
