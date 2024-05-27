package dubijo;
/**
 * Clase rectángulo que hereda de {@link Line}
 * 
 * @author junior
 *
 */
public class Rectangle extends Line{
	/**
	 * atributo: height
	 */
	private int height;
	/**
	 * Constructor por defecto de Rectangle
	 */
	public Rectangle() {
		super();
	}
	/**
	 * Constructor con parámetros de Rectangle
	 * @param width ancho
	 * @param height alto
	 */
	public Rectangle(int width, int height) {
		super(width);
		setHeight(height);
	}
	/**
	 * get de height
	 * @return int
	 * @since 1.0
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * set de height
	 * @param height
	 * @since 1.0
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * getArea
	 * @return int
	 * @since 1.1
	 */
	public int getArea() {
		return getWidth()*height;
	}
	/**
	 * toString de Rectangle
	 * @since 1.0
	 */
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", getWidth()=" + getWidth() + "]";
	}
	

}
