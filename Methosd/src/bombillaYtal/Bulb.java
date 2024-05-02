package bombillaYtal;

public class Bulb {
	//Atributes
	private int power;
	private boolean on;
	//Builder
	public Bulb(int power, boolean on) {
		setPower(power);
		setOn(on);
	}
	public Bulb(int power) {
		this(power,false);
	}
	public Bulb(boolean on) {
		this(100,on);
	}
	public Bulb() {
		this(100,false);
	}
	//Methods
	
	//Get y Set
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
	
	//toString
	@Override
	public String toString() {
		return "Bulb [power=" + power + ", on=" + on + "]";
	}
}
