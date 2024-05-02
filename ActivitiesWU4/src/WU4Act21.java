import java.util.Scanner;

public class WU4Act21 {
	public static void main(String[] args) {
		int letter;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter char (vowel)");
		letter = keyboard.next().charAt(0);
		keyboard.close();
		switch(letter) {
		case 'a':
		case 'A':
			System.out.println("You chose the vowel 'a'");
			break;
		case 'e':
		case 'E':
			System.out.println("You chose the vowel 'e'");
			break;
		case 'i':
		case 'I':
			System.out.println("You chose the vowel 'i'");
			break;
		case 'o':
		case 'O':
			System.out.println("You chose the vowel 'o'");
			break;
		case 'u':
		case 'U':
			System.out.println("You chose the vowel 'u'");
			break;
		case 'y':
		case 'Y':
			System.err.println("Te parece divertido tontito, esto no es un puto juego. Yo ya estaba ejecutando código desde antes de que conectases dos neuronas, noname de mierda.");
		default:
			System.err.println("--sighs angrily--");
			System.out.println("Please, NEXT TIME do enter a vowel.");
		}
	}
}
