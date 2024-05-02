package exercise2;

public class Dni {
	// atributes
	private int numbers;
	private char letter;

	// builders
	public Dni(int number, char letter) {
		super();
		try {
			setNumbers(number);
			setLetter(letter,this.numbers);
		} catch (IllegalArgumentException e) {
			setNumbers(0);
		}
	}
	public Dni(int number) {
		super();
		try {
			setNumbers(number);
			setLetter(calculateLetter(number),this.numbers);
		} catch (IllegalArgumentException e) {
			setNumbers(0);
		}
	}
	
	//methods
	public boolean checkNumber(int number) {
		//TODO cambiar por IncorrectRange si consigo que funcione
		if (number < 0 || number > 99999999) {
			throw new IllegalArgumentException("rango válido [0-99999999]");
		}else {
			return true;
		}
	}
	public boolean checkLetter(int number, char letter){
		if(letter!=calculateLetter(number)) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public char calculateLetter(int number) {
		int rest=number%23;
		switch(rest) {
		case 0:
			return 'T';
		case 1:
			return 'R';
		case 2:
			return 'W';
		case 3:
			return 'A';
		case 4:
			return 'G';
		case 5:
			return 'M';
		case 6:
			return 'Y';
		case 7:
			return 'F';
		case 8:
			return 'P';
		case 9:
			return 'D';
		case 10:
			return 'X';
		case 11:
			return 'B';
		case 12:
			return 'N';
		case 13:
			return 'J';
		case 14:
			return 'Z';
		case 15:
			return 'S';
		case 16:
			return 'Q';
		case 17:
			return 'V';
		case 18:
			return 'H';
		case 19:
			return 'L';
		case 20:
			return 'C';
		case 21:
			return 'K';
		case 22:
			return 'E';
		}
		return '0';
	}
	// get y set
	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		if(checkNumber(numbers)){
			this.numbers=numbers;
		}
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter,int number) {
		if(!checkLetter(number,letter)) {
			throw new IllegalArgumentException("Letra Incorrecta");
		}else {
			this.letter = letter;
		}
	}
	public String showDNI() {
		return "Dni--"+numbers+letter;
	}
	


}
