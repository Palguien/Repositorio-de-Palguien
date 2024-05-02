package enumexample;

import java.util.Scanner;

public class EnumExample {

	public static void main(String[] args) {
		Days today = Days.THURSDAY;
		
		if(today==Days.THURSDAY) {
			System.out.println("Feliz Jueves");
		}

		System.out.println("Today is "+today);
		//go through all values
		System.out.println("days of the week are: ");
		for (Days aux : Days.values()) {
			System.out.print(aux+" ");
		}
		//ask the user a value
		System.out.println();
		Scanner	keyboard = new Scanner(System.in);
		
		boolean seguir = true;
		while(seguir) {
			try {
				System.out.println("Give me a day of the week");
				String aux=keyboard.next();
				today=Days.valueOf(aux.toUpperCase());
				System.out.println(today);
			}catch(IllegalArgumentException e) {
				e.printStackTrace();
				seguir=false;
			}
		}
		keyboard.close();
	}

}
