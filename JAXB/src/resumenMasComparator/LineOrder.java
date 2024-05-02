package resumenMasComparator;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement (name="lineorder")
@XmlAccessorType (XmlAccessType.FIELD)
public class LineOrder implements Serializable, Comparable<Object>{
	//en caso de usar linea de serializacion binaria al escribir objetos en fichero para leerlos 
	//tienen que tener el mismo serialVersion y el mismo nombre de paquete
	private static final long serialVersionUID = 2L;
	
	double price;
	int units;
	String description;
	
	public LineOrder() {
		super();
	}
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
	@Override
	public int compareTo(Object otter) {
			return (int) (this.price-((LineOrder) otter).getPrice());

	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
