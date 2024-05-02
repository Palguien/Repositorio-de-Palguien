package aparatos;

import exceptions.NegativeInputException;

public class Refrigerator extends Aparato{
	private float capacity;
	public Refrigerator(float power, String calification, float capacity) throws NegativeInputException {
		super(power, calification);
		setCapacity(capacity);
	}
//	public Refrigerator() throws InvalidInputException, NegativeInputException {
//		super();
//		setCapacity(dialogs.Dialogs.askFloatDialog("capacity of the refrigerator?"));
//	}
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) throws NegativeInputException {
		this.capacity = capacity;
		if(capacity<0) {
			throw new NegativeInputException();
		}
	}
	@Override
	public String toString() {
		return "Refrigerator [capacity=" + capacity + ", getCalification()=" + getCalification() + ", getPower()="
				+ getPower() + ", getId()=" + getId() + "]";
	}
	


}
