package dubijo;

public class Line {
	//atributes
	private int width;
	//builder
	public Line() {
		super();
	}
	public Line(int width) {
		setWidth(width);
	}
	//get y set
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return width;
	}
	@Override
	public String toString() {
		return "Line [width=" + width + "]";
	}
}
