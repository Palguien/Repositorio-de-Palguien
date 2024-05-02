package PabloPollos_jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadJAXB {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(GrupoPartner.class);
			Unmarshaller um = context.createUnmarshaller();

			GrupoPartner pars= (GrupoPartner) um.unmarshal(new File(".\\xml","partners.xml"));
			System.out.println(pars.toString());
		}catch(JAXBException e) {
			e.printStackTrace();
		}

	}

}
