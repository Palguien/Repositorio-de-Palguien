import java.util.ArrayList;
import java.util.Iterator;

public class Ej16 {
	//Exercise 16: We create a list of objects of type "Student". Then we will add elements to the list 
	// (names of students and their ages). Finally, we will traverse the list using an iterator with a generic. 
	public static void main(String args[]) {
	         ArrayList <Alumno> clase=new ArrayList<Alumno>(); //create the list
	         clase.add(new Alumno(0, "Javier López", 18, "daw1")); //add the elements
	         clase.add(new Alumno(1, "Victoria Ramos", 19, "daw1")); 
	         clase.add(new Alumno(2, "Cristina Corominas", 18, "daw2")); 
	         clase.add(new Alumno(3, "Javier García", 19, "daw1"));
	         Iterator <Alumno> object=clase.iterator(); //we create the parameterized iterator.
	         while(object.hasNext()){ //we scroll through the collection displaying the student data
	        	 Alumno alum=object.next();
	        	 System.out.println(alum.toString());
	        	 
	        }
	}
}
