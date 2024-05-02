package example2;

public enum WoodType {
	OAK("Blue",2),CHERRY("Pink",4),WALNUT("Brown",4),PINE("Dark Brown",5);
	private final float density;
	private final String color;
	
	WoodType(String color,float density) {
		this.color=color;
		this.density=density;
	}

	public float getDensity() {
		return density;
	}

	public String getColor() {
		return color;
	}
}
