package probandoObjetos;

public class Book {
	//Atributes
	private String title;
	private String author;
	private static String publisher = "Black Library";

	//Constructor
	public Book() {
		setTitle("Untitled");
		setAuthor("Anonymous");
	}
	public Book(String title){
		setTitle(title);
		setAuthor("Anonymous");
	}
	public Book(String title,String author){
		setTitle(title);
		setAuthor(author);
	}
	//Methods
	public void printBook() {
		System.out.println("-----------------------------------------");
		System.out.println("Title: "+getTitle());
		System.out.println("Author: "+getAuthor());
		System.out.println("Publisher: "+getPublisher());
		System.out.println("-----------------------------------------");
	}
	public String toString() {
		return "Title: "+getTitle()+" Author: "+getAuthor()+" Publisher: "+getPublisher();
		
	}
	//Get y Set
	private String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private String getAuthor() {
		return author;
	}
	private void setAuthor(String author) {
		this.author = author;
	}
	private static String getPublisher() {
		return publisher;
	}
	public static void setPublisher(String publisher) {
		Book.publisher=publisher;
		
	}

}
