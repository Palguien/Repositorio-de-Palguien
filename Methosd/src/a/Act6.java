package a;

public class Act6 {

	public static void main(String[] args) {
		float celsius = -5;
		System.out.println(celsiusToFahr(celsius));

	}

	private static float celsiusToFahr(float celsius) {
		return (celsius * 9 / 5) + 32;
	}

}
