package a;

public class Act5 {

	public static void main(String[] args) {
		int num1=6,num2=3;
		divisor(num1,num2);
	}

	private static void divisor(int num1, int num2) {
		boolean divisor=false;
		if(num1>=num2) {
			if(num1%num2==0) {
				divisor=true;
			}
		}else {
			if(num2%num1==0) {
				divisor=true;
			}
		}
		if(divisor) {
			System.out.println("El pequeño es divisor del grande");
		}else {
			System.out.println("El pequeño no es divisor del grande");
		}
		
	}

}
