package aparatos;

import exceptions.NegativeInputException;

public class Dishwasher extends Washer{
	private int servicesMax;
	public Dishwasher(float power, String calification, float waterConsumption, int servicesMax) throws NegativeInputException {
		super(power, calification, waterConsumption);
		setServicesMax(servicesMax);
	}
//	public Dishwasher() throws NegativeInputException, InvalidInputException {
//		super();
//		setWaterConsumption(dialogs.Dialogs.askIntDialog("servicesMax of the dishwasher?"));
//	}
	public int getServicesMax() {
		return servicesMax;
	}
	public void setServicesMax(int servicesMax) throws NegativeInputException {
		this.servicesMax = servicesMax;
		if(servicesMax<0) {
			throw new NegativeInputException();
		}
	}
	@Override
	public String toString() {
		return "Dishwasher [servicesMax=" + servicesMax + ", getWaterConsumption()=" + getWaterConsumption()
				+ ", getCalification()=" + getCalification() + ", getPower()=" + getPower() + ", getId()=" + getId()
				+ "]";
	}
	
}
