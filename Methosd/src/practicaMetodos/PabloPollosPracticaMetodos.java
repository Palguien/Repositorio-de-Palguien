package practicaMetodos;

import java.util.Scanner;
/**
 * @author Pablo
 */
public class PabloPollosPracticaMetodos {

	public static void main(String[] args) {
		String cadena1,cadena2;
		char exit;
		//open keyboard
		Scanner keyboard = new Scanner(System.in);
		//main loop
		do {
			//asks the user to input the strings to compare
			System.out.println("String 1 to check anagrams (Only one word is taken):");
			cadena1=keyboard.next();
			keyboard.nextLine();
			System.out.println("String 2 to check anagrams (Only one word is taken):");
			cadena2=keyboard.next();
			keyboard.nextLine();
			//compares if they are the same word
			if(cadena1.compareToIgnoreCase(cadena2)==0) {
				System.out.println("They are the same word, DICKWEED");
			}else {
				//checks if they are anagrams
				if(areAnagram(cadena1,cadena2)){
					System.out.println("They are anagrams");
				}else {
					System.out.println("They are not anagrams");
				}
			}
			do {	//checks if the user wants to exit
				System.out.println("Do you wish to continue (y/n):?");
				exit=keyboard.next().charAt(0);
				keyboard.nextLine();
			}while(exit!='n' && exit!='y');
		}while(exit=='y');
		//close keyboard
		keyboard.close();

	}
	/**
	 * compares two strings 
	 * @param cadena1	compares it to cadena 1 to see if they are anagrams
	 * @param cadena2	compares it to cadena 2 to see if they are anagrams
	 * @return anagram	boolean (true if they are anagrams, false if they are not)
	 */
	private static boolean areAnagram(String cadena1, String cadena2) {
		//sets the strings to lowercase to avoid mistakes
		cadena1=cadena1.toLowerCase();
		cadena2=cadena2.toLowerCase();
		boolean anagram=true;	//if we find that the strings aren't anagrams we set it to false
		char caracter;			//character that we are analizing
		int repCad1,repCad2;	//how many times the character appears in each string
		//check that the strings are the same length
		if(cadena1.length()!=cadena2.length()) {
			anagram=false;
		}else {
			//checks each char of the first string
			for (int i = 0; i < cadena1.length(); i++) {
				caracter=cadena1.charAt(i);
				repCad1=0;
				repCad2=0;
				//counts how many times said char appears in the first string
				for (int j = 0; j < cadena1.length(); j++) {
					if(cadena1.charAt(j)==caracter) {
						repCad1++;
					}
				}
				//counts how many times said char appears in the second string
				for (int j = 0; j < cadena1.length(); j++) {
					if(cadena2.charAt(j)==caracter) {
						repCad2++;
					}
				}
				//if the times that the char appears in each string doesn't coincide, it isn't an anagram
				if(repCad1!=repCad2) {
					anagram=false;
					break;
				}
			}
		}
		return anagram;
	}

}
