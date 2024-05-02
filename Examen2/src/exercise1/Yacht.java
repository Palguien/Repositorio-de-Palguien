package exercise1;

public class Yacht extends Sporty {
	//Atributes
	private int cabins;
	//Builder
	public Yacht() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Yacht(int plate, int length, int year) {
		super(plate, length, year);
		// TODO Auto-generated constructor stub
	}
	//Methods
	/**
	 * Calculates the rental of the yacht
	 * @return int
	 */
	@Override
	public int getValRent() {
		// TODO Auto-generated method stub
		return super.getValRent()+cabins;
	}
	//Get y Set
	public int getCabins() {
		return cabins;
	}

	public void setCabins(int cabins) {
		this.cabins = cabins;
		if(cabins<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
	}
}
