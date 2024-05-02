package probandoObjetos;

public class Students {
	//atributos
	private static String company="BurriKing";
	private int age;
	private String name;
	//constructor
	public Students() {
		setAge(18);
		setName("Bob");
	}
	public Students(int edad, String nombre) {
		setAge(edad);
		setName(nombre);
	}
	//method
	public void printData() {
		System.out.println("------------------");
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Company: "+getCompany());
		System.out.println("------------------");
		
	}
	//get y set
	public String getCompany() {
		return company;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
