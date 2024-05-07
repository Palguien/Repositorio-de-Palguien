package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class segundoArray {
	
	public static void main(String args[]) {

		  ArrayList<Comparable> c= new ArrayList<Comparable>();
		  c.add(3);
		  c.add(9.5);
		  c.add(1, "Hello Majo!!");
		  c.add(35);
		  System.out.println("Display the collection");
		  displayCollection(c);
		  System.out.println("---------------------------------------------------------------------------------------------");
		//substitute
		  c.set(1, "taaaaaaaa");
		  System.out.println("Display the collection");
		  displayCollection(c);
		  System.out.println("---------------------------------------------------------------------------------------------");
		//deleted
		  System.out.println("Let's delete the content of position 2");
		  c.remove(2);
		  displayCollection(c);
		  System.out.println("---------------------------------------------------------------------------------------------");
		  System.out.println("Let's delete the content of the position that contains 'taaaaaaaa'");
		  c.remove("taaaaaaaa");
		  displayCollection(c);
		}

	public static void displayCollection(List<Comparable> c) {
		  //System.out.println("Display the collection");
		  //create the iterator 
		  ListIterator<Comparable> iterator;
		  //invoking the listIterator method we relate the iterator with the list to rerun it
		  iterator=c.listIterator();
		  String string;
		  //Recorrecting the list using the iterator
		  while (iterator.hasNext()) {
		    System.out.println();
		    System.out.print("Position: "+iterator.nextIndex()+"  ");
		  //Convert the value read to a string
		    string=String.valueOf(iterator.next());
		    System.out.println("Value: "+string);
		  
		  }
		}

}
