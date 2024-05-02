import java.util.Scanner;

public class Ut4Act1 {
	public static void main(String[] args) {
		final float PI = 3.141592f;
		float radius;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the radius of the circle: ");
		radius = keyboard.nextFloat();
		keyboard.close();
		System.out.println("Length of the circle = "+2*PI*radius);
		System.out.println("Area of the circle = "+PI*radius*radius);
	}
}
