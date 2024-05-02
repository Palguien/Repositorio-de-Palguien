package PabloPollos_jaxb;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="lines")
@XmlAccessorType (XmlAccessType.FIELD)
public class GrupoPartner {
	@XmlElement (name="lineorder", type = Partner.class)
	private Partner[] partners;

	public GrupoPartner() {
		super();
	}

	public GrupoPartner(Partner[] partners) {
		super();
		this.partners = partners;
	}
	
	public Partner[] getPartners() {
		return partners;
	}

	public void setPartners(Partner[] partners) {
		this.partners = partners;
	}

	@Override
	public String toString() {
		return "GrupoPartner [partners=" + Arrays.toString(partners) + "]";
	}
	
}
