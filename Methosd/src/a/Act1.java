package a;

public class Act1 {

	public static void main(String[] args) {
		int num1=3,num2=0;
		System.out.println("Num1 = "+num1+"   Num2 = "+num2);
		System.out.println("---------------------------------");
		System.out.println("Addition = "+addition(num1,num2));
		System.out.println("Substraction = "+substraction(num1,num2));
		System.out.println("Multiplication = "+mult(num1,num2));
		try {
			System.out.println("Division = "+div(num1,num2));
		}catch(ArithmeticException ex) {
			System.err.println("MATH ERROR. We can't divide by 0.");
		}
		

	}
	/**
	 * Adds two numbers and returns the total
	 * 
	 * @param a		first number to add
	 * @param b		first number to add
	 * @return addition		addition of the two numbers
	 */
	public static int addition(int a, int b) {
		int addition=a+b;
		return addition;
	}
	/**
	 * Substraction between two numbers and returns the total
	 * 
	 * @param a		first number
	 * @param b		number to substract from the first
	 * @return substraction		substraction of the two numbers
	 */
	public static int substraction(int a, int b) {
		int substraction=a-b;
		return substraction;
	}
	/**
	 * multiplicates two numbers and returns the total
	 * 
	 * @param a		first number to multiply
	 * @param b		first number to multiply
	 * @return mult		multiplication of the two numbers
	 */
	public static int mult(int a, int b) {
		int mult=a*b;
		return mult;
	}
	/**
	 * Division between two numbers and returns the total.
	 * 
	 * @param a		dividend
	 * @param b		divider
	 * @throws ArithmeticException	if the second number is 0, we can't divide by 0
	 * @return div		division of the two numbers
	 */
	public static float div(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Don't divide by 0, you moron");
		}
		float div=(float)a/(float)b;
		return div;
	}

}
