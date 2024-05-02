package aparatos;

import java.time.LocalDate;

import exceptions.NegativeInputException;


public class Aparato {
	//Atributes
	private int id;
	private float power;
	//private char calification;
	private PowerRating rating;
	private static int nextNumber = 1;
	private LocalDate creation;
	//Builder
	public Aparato(float power, String rating) throws NegativeInputException {
		super();
		try {
			setCalification(PowerRating.valueOf(rating));
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
			System.err.println("Dickweed");
		}
		setPower(power);
		setId(nextNumber);
		setNextNumber(nextNumber+1);
		setCreation(LocalDate.now());
	}
	
//	public Aparato() throws InvalidInputException, NegativeInputException {
//		String aux=JOptionPane.showInputDialog(null, "calification (char)", "INPUT", JOptionPane.QUESTION_MESSAGE);
//		if(aux.length()==1) {
//			setCalification(aux.charAt(0));
//			setPower(dialogs.Dialogs.askFloatDialog("power of the appliance?"));
//			setId(nextNumber);
//			setNextNumber(nextNumber+1);
//		}else {
//			throw new InvalidInputException();
//		}
//		
//	}
	//Method
	//Set y Get
	public PowerRating getCalification() {
		return rating;
	}
	private void setCalification(PowerRating rating2) {
		this.rating = rating2;
	}
	public float getPower() {
		return power;
	}
	public void setPower(float power) throws NegativeInputException {
		this.power = power;
		if(power<0) {
			throw new NegativeInputException();
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Aparato [id=" + id + ", power=" + power + ", calification=" + rating + ", creation date="+getCreation()+"]";
	}

	public static int getNextNumber() {
		return nextNumber;
	}

	public static void setNextNumber(int number) {
		Aparato.nextNumber = number;
	}

	public LocalDate getCreation() {
		return creation;
	}

	private void setCreation(LocalDate creation) {
		this.creation = creation;
	}
	
}
