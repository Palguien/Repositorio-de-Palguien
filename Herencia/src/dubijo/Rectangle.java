package dubijo;

public class Rectangle extends Line{
	private int height;
	
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super(width);
		setHeight(height);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return getWidth()*height;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", getWidth()=" + getWidth() + "]";
	}
	

}
