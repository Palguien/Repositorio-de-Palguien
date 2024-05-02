package PabloPollos_jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteJAXB {

	public static void main(String[] args) {
		Partner par1= new Partner(1,"Anselmo","23-4-1993");
		Partner par2= new Partner(2,"Juliano","13-4-2000");
		Partner par3=new Partner(3,"Recesvinto","23-3-548");
		Partner[] par = {par1, par2, par3};
		GrupoPartner pars = new GrupoPartner(par);
		try {
			JAXBContext context = JAXBContext.newInstance(GrupoPartner.class);
			Marshaller m = context.createMarshaller();
			//Create the object to write
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(pars,new File(".\\xml","partners.xml"));
		}catch(JAXBException e) {
			e.printStackTrace();
		}

	}

}