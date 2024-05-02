package aparatos;

import exceptions.NegativeInputException;

public class WashingMachine extends Washer{
	private int maximumKG;
	public WashingMachine(float power, String calification, float waterConsumption, int maximumKG) throws NegativeInputException {
		super(power, calification, waterConsumption);
		setMaximumKG(maximumKG);
	}
//	public WashingMachine() throws NegativeInputException, InvalidInputException {
//		super();
//		setWaterConsumption(dialogs.Dialogs.askIntDialog("maximumKG of the washing machine?"));
//	}
	public int getMaximumKG() {
		return maximumKG;
	}
	public void setMaximumKG(int maximumKG) throws NegativeInputException {
		this.maximumKG = maximumKG;
		if(maximumKG<0) {
			throw new NegativeInputException();
		}
	}
	@Override
	public String toString() {
		return "WashingMachine [maximumKG=" + maximumKG + ", getWaterConsumption()=" + getWaterConsumption()
				+ ", getCalification()=" + getCalification() + ", getPower()=" + getPower() + ", getId()=" + getId()
				+ "]";
	}
	

}
