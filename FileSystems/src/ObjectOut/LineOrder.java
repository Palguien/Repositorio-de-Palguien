package ObjectOut;

import java.io.Serializable;

public class LineOrder implements Serializable{
	//en caso de usar linea de serializacion binaria al escribir objetos en fichero para leerlos 
	//tienen que tener el mismo serialVersion y el mismo nombre de paquete
	private static final long serialVersionUID = 2L;
	
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
