package bufferYReader;

public class LineOrder {
	double price;
	int units;
	String description;
	
	public LineOrder(String description, int units, double price ) {
		super();
		this.price = price;
		this.units = units;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "LineOrder [price=" + price + ", units=" + units + ", description=" + description + "]";
	}
	
	public double getTotal() {
		return units*price;
	}
}
