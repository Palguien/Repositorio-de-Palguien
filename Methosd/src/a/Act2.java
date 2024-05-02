package a;

public class Act2 {

	public static void main(String[] args) {
		String number = "12389.4567";
		double num;
		num=stringToFloat(number);
		System.out.println(num);

	}
	/**
	 * Convierte una cadena de un numero decimal (Ej."1234.567") a double.
	 * @param number	cadena a convertir a double
	 * @return num		double resultado
	 */
	private static double stringToFloat(String number) {
		double num=0;
		for (int i = 0; i < number.length(); i++) {
			if(number.charAt(i)=='.') {
				continue;
			}
			num=num*10+(int)(number.charAt(i))-48;
		}
		if(number.indexOf('.')!=-1) {
			num=num/((Math.pow(10,(number.length()-1-number.indexOf('.')))));
		}
		return num;
	}
	

}
