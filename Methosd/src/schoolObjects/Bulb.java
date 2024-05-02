package schoolObjects;

public class Bulb {
	private int power;
	private boolean on;
	
	public Bulb(){
		setPower(10);
		setOn(false);
	}
	
	public Bulb(int power){
		setPower(power);
		setOn(false);
	}
	
	public Bulb(boolean on){
		setPower(10);
		setOn(on);
	}
	
	public Bulb(int power,boolean on){
		setPower(power);
		setOn(on);
	}
	
	//get y set
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}


}
