package resumenMasComparator;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="lines")
@XmlAccessorType (XmlAccessType.FIELD)
public class Lines {
	@XmlElement (name="lineorder", type = LineOrder.class)
	private LineOrder[] partners;

	public Lines() {
		super();
	}

	public Lines(LineOrder[] partners) {
		super();
		this.partners = partners;
	}
	
	public LineOrder[] getPartners() {
		return partners;
	}

	public void setPartners(LineOrder[] partners) {
		this.partners = partners;
	}
	
	@Override
	public String toString() {
		return "Lines [LineOrders=" + Arrays.toString(partners) + "]";
	}
	
}
