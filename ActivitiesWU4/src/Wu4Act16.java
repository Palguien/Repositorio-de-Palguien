import java.util.Scanner;
//explicit casting
public class Wu4Act16 {
	public static void main(String[] args) {
		int num1,num2;
		float floti;
		float result1;
		long result2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Mete un float aweonao");
		floti = keyboard.nextFloat();
		System.out.println("floti: "+floti);
		
		System.out.println("Ahora un entero");
		num1 = keyboard.nextInt();
		System.out.println("Otro entero");
		num2 = keyboard.nextInt();
		System.out.println("enteros: "+num1+" y "+num2);
		
		result1=(float)(num1)/(float)(num2);		
		System.out.println("num1/num2= "+result1);
		result2=(long)num1*(long)num2;		
		System.out.println("num1*num2= "+result2);
		
		keyboard.close();
	}
}