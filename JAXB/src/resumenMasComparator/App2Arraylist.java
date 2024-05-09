package resumenMasComparator;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public class App2Arraylist {

	public static void main(String[] args) {
		ArrayList<LineOrder> clase=new ArrayList<LineOrder>();
		
		LineOrder par1= new LineOrder("objeto1",50,1);
		LineOrder par2= new LineOrder("objeto2",20,2);
		LineOrder par3=new LineOrder("objeto3",30,3);
		LineOrder[] par = {par1, par2, par3};
		
		//Arrays.sort(par, new LineOrderComparator());
		Arrays.sort(par, par1);
		
		Lines pars = new Lines(par);
		
		for (LineOrder lineOrder : par) {
			System.out.println(lineOrder.toString());
		}
		
		boolean exit=false;
		
		//Chooser y filtros
		JFileChooser chooser = new JFileChooser(".\\fils");
		File fich;
		
		int selec;
		String[] options= {"Write XML","Read XML","Write Obj","Read Obj","Obj to XML","XML to Obj"};
		while(exit==false) {
			selec=JOptionPane.showOptionDialog(null, "Elige", "SELECT", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
			switch(selec) {
			//Write XML
			case 0:
				chooser.showOpenDialog(null);
				fich = chooser.getSelectedFile();
				EscribirXML(pars,fich);
				break;
			//Read XML
			case 1:
				chooser.showOpenDialog(null);
				fich = chooser.getSelectedFile();
				System.out.println(LeerXML(pars,fich).toString());
				break;
			//Write Obj
			case 2:
				chooser.showOpenDialog(null);
				fich = chooser.getSelectedFile();
				EscribirObj(par,fich);
				break;
			//Read Obj
			case 3:
				chooser.showOpenDialog(null);
				fich = chooser.getSelectedFile();
				System.out.println(LeerObj(par,fich).toString());
				break;
			//Obj to XML
			case 4:
				chooser.showOpenDialog(null);
				fich = chooser.getSelectedFile();
				par = LeerObj(par,fich);
				pars = new Lines(par);
				chooser.showOpenDialog(null);
				fich = chooser.getSelectedFile();
				EscribirXML(pars, fich);
				break;
			//XML to Obj
			case 5:
				chooser.showOpenDialog(null);
				fich = chooser.getSelectedFile();
				System.out.println(LeerXML(pars,fich));
				chooser.showOpenDialog(null);
				fich = chooser.getSelectedFile();
				EscribirObj(par,fich);
				System.out.println("Array parte 1");
				for (int i = 0; i < par.length; i++) {
					clase.add(par[i]);
				}
				break;
			default:
				System.out.println("Exiting...");
				exit=true;
			}
			System.out.println("Array lectura");
			Iterator<LineOrder> iter=clase.iterator();
			while(iter.hasNext()) {
				iter.next().toString();
			}
		}
	}



	private static LineOrder[] LeerObj(LineOrder[] par, File fich) {
		FileInputStream fileStreamIn;
		
		LineOrder[] parB = new LineOrder[10];
		try {
			fileStreamIn = new FileInputStream(fich);
			ObjectInputStream objFileIn = new ObjectInputStream(fileStreamIn);
			// reading objects
			int cont = 0;
			while (true) {
				try {
					parB[cont] = (LineOrder) objFileIn.readObject();
					cont++;
				} catch (EOFException | ClassNotFoundException e) {
					break;
				}
			}
			objFileIn.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		

		for (int i = 0; i < par.length; i++) {
			if(par[i]==null) {
				break;
			}else {
				System.out.println(par[i].toString());
			}

		}
		return parB;
	}

	private static void EscribirObj(LineOrder[] par, File fich) {
		// creating the object file
		FileOutputStream fileStreamOut;
		
		try {
			fileStreamOut = new FileOutputStream(fich);
			ObjectOutputStream objFileOut;
			objFileOut = new ObjectOutputStream(fileStreamOut);
			// writing objects
			for (LineOrder element : par) {
				objFileOut.writeObject(element);
			}
			objFileOut.close();
		} catch (FileNotFoundException e1) {		
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void EscribirXML(Lines pars,File fich) {
		try {
			JAXBContext context = JAXBContext.newInstance(Lines.class);
			Marshaller m = context.createMarshaller();
			//Create the object to write
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(pars,fich);
		}catch(JAXBException e) {
			e.printStackTrace();
		}
	}
	
	private static Lines LeerXML(Lines pars, File fich) {
		try {
			JAXBContext context = JAXBContext.newInstance(Lines.class);
			Unmarshaller um = context.createUnmarshaller();

			Lines parsB= (Lines) um.unmarshal(fich);
			return parsB;
		}catch(JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
