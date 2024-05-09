import java.util.ArrayList;
import java.util.Iterator;


public class Ej15 {
	
	public static void main(String[] args) {
	       
        ArrayList clase=new ArrayList();
        Alumno alum;
        
        clase.add(new Alumno(1, "Pepe",17, "daw1"));
        clase.add("John");
        clase.add(28);
        
        Iterator iter=clase.iterator();
        while (iter.hasNext()){
        	System.out.println(iter.next());
        }
    }
	
	


}
