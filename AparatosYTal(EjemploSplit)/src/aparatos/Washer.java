package aparatos;

import exceptions.NegativeInputException;

public class Washer extends Aparato {
	private float waterConsumption;
	public Washer(float power, String calification, float waterConsumption) throws NegativeInputException {
		super(power, calification);
		setWaterConsumption(waterConsumption);
	}
//	public Washer() throws NegativeInputException, InvalidInputException {
//		super();
//		setWaterConsumption(dialogs.Dialogs.askFloatDialog("waterConsumption of the washer?"));
//	}
	public float getWaterConsumption() {
		return waterConsumption;
	}
	public void setWaterConsumption(float waterConsumption) throws NegativeInputException {
		this.waterConsumption = waterConsumption;
		if(waterConsumption<0) {
			throw new NegativeInputException();
		}
	}
	@Override
	public String toString() {
		return "Washer [waterConsumption=" + waterConsumption + ", getCalification()=" + getCalification()
				+ ", getPower()=" + getPower() + ", getId()=" + getId() + "]";
	}
	

}
