package PabloPollos_jaxb;

import javax.xml.bind.annotation.*;

@XmlRootElement (name="partner")
@XmlAccessorType (XmlAccessType.FIELD)
public class Partner {
	@XmlAttribute (name="id")
	private int identificator;
	@XmlElement (name="nombre")
	private String partnerName;
	private String date;
	
	public Partner() {
		super();
	}
	public Partner(int identificator, String partnerName, String date) {
		super();
		this.identificator = identificator;
		this.partnerName = partnerName;
		this.date = date;
	}
	
	public int getIdentificator() {
		return identificator;
	}
	public void setIdentificator(int identificator) {
		this.identificator = identificator;
	}

	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Partner [identificator=" + identificator + ", partnerName=" + partnerName + ", date=" + date + "]";
	}
	
	
}
