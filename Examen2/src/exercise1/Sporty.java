package exercise1;

public class Sporty extends Boat {
	//Atributes
	private int power;
	//Builders
	public Sporty() {
		super();
		
	}

	public Sporty(int plate, int length, int year) {
		super(plate, length, year);
		// TODO Auto-generated constructor stub
	}
	//Methods
	/**
	 * Calculates the rental of the Sporty
	 * @return int
	 */
	@Override
	public int getValRent() {
		return super.getValRent()+power;
	}
	//get y Set
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
		if(power<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
	}
	
}
