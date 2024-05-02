package exercise1;

public class Sailboat extends Boat {
	private int masts;
	
	public Sailboat() {
		super();
	}

	public Sailboat(int plate, int length, int year) {
		super(plate, length, year);
		setMasts(masts);
	}
	//Methods
	/**
	 * Calculates the rental of the sailboat
	 * @return int
	 */
	@Override
	public int getValRent() {
		return super.getValRent()+masts;
	}
	
	public int getMasts() {
		return masts;
	}

	public void setMasts(int masts) {
		this.masts = masts;
		if(masts<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
	}
}
