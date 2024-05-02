package personasYtal;

public class Persona {
	//Atributes
	private String name;
	private String surname;
	private String adress;
	private int age;
	//Builders
	public Persona(String name,String surname, String adress, int age) {
		super();
		setName(name);
		setSurname(surname);
		setAdress(adress);
		setAge(age);
	}
	
	public Persona(String name,String surname, String adress) {
		this(name,surname,adress,0);
	}
	
	public Persona(String name,String surname) {
		this(name,surname,null,0);
	}
	public Persona() {
		super();
	}
	//method
	
	//get y set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	//toString
	@Override
	public String toString() {
		return "Persona [name=" + name + ", surname=" + surname + ", adress=" + adress + ", age=" + age + "]";
	}
	
}
