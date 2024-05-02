package loops;
import java.util.Scanner;
//reads 4 sentences and writes them at the end
public class WU4Act29 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String sentence;
		String result = "";
		for(int i=0;i<4;i++) {
			sentence=keyboard.nextLine();
			result = result + sentence + "\n";
		}
		keyboard.close();
		System.out.println(result);
	}
}
