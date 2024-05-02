package strings;

public class Act8 {
	public static void main(String[] args) {
		String cadena1 = "abcdefghijijilmndefopppppdeidef", cadena2 = "ppp";
		int pos = 0, repet = 0;
		boolean exit = false;
		while (!exit) {
			pos = cadena1.indexOf(cadena2,pos);
			if (pos == -1) {
				exit = true;
			} else {
				repet++;
				pos++;
			}

		}
		System.out.println("Instancias de " + cadena2 + " en " + cadena1 + " = " + repet);

	}
}
