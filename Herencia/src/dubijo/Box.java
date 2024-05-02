package dubijo;

public class Box extends Rectangle {
	private int thickness;

	public Box() {
		super();
	}
	public Box(int width, int height, int thickness) {
		super(width,height);
		setThickness(thickness);
	}
	public int getVolume() {
		return getArea()*getThickness();
	}
	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	@Override
	public String toString() {
		return "Box [thickness=" + thickness + ", getHeight()=" + getHeight() + ", getWidth()=" + getWidth() + "]";
	}
	

}
