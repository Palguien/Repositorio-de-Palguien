package exercise1;

public class Rental {
	//Atributes
	private String DNI;
	private int numDays;
	private int[] mooringPos = new int[2];
	private static int PR_BASE = 15;
	private Boat boat;
	//Builders
	public Rental() {
		super();
	}
	public Rental(String dNI, int numDays, int[] mooringPos, Boat boat) {
		super();
		DNI = dNI;
		this.numDays = numDays;
		this.mooringPos = mooringPos;
		this.boat = boat;
	}
	//Methods
	public int calculateRental() {
		return boat.getValRent()*numDays;
	}
	//Get y Set
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
		if(dNI.length()!=9) {
			throw new IllegalArgumentException("El DNI debe tener 9 caracteres");
		}
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
		if(numDays<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
	}

	public int[] getMooringPos() {
		return mooringPos;
	}

	public void setMooringPos(int[] mooringPos) {
		this.mooringPos = mooringPos;
		if(mooringPos[0]<0 || mooringPos[1]<0) {
			throw new IllegalArgumentException("Ninguna de las dos coordenadas pueden ser negativas");
		}
	}

	public static int getPR_BASE() {
		return PR_BASE;
	}

	public static void setPR_BASE(int pR_BASE) {
		if(pR_BASE<1) {
			throw new IllegalArgumentException("No se aceptan negativos ni 0");
		}
		PR_BASE = pR_BASE;
	}

	public Boat getBoat() {
		return boat;
	}

	public void setBoat(Boat boat) {	
		if(boat==null) {
			throw new IllegalArgumentException("No puede ser nulo");
		}
		this.boat = boat;
	}

}
