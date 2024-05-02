package exercise1;

public class Boat {
	//Atributes
	private int plate;
	private int length;
	private int year;
	//Builders
	public Boat() {
		super();
	}
	public Boat(int plate,int length, int year) {
		setPlate(plate);
		setLength(length);
		setYear(year);
	}
	//Methods
	/**
	 * Calculates the rental of a boat (Length*10*PR_BASE)
	 * @return int
	 */
	public int getValRent() {
		return length*10*Rental.getPR_BASE();
	}
	//Get y set
	public int getPlate() {
		return plate;
	}
	public void setPlate(int plate) {
		this.plate = plate;
		if(plate<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
		if(length<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		if(year<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
	}
}
