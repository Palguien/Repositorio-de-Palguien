package probandoObjetos;

public class FamilyMember {
	//Atributes
	private String name;
	private static String address = "EMPTY";
	private int age;
	//Constructor
	public FamilyMember(String name,int age) {
		setName(name);
		setAge(age);
	}
	//Methods
	public String toString() {
		return ">>Name: "+getName()+" Age: "+getAge()+" Address: "+getAddress();
	}
	//Get y set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		FamilyMember.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//main
	public static void main(String[] args) {
		FamilyMember m1 = new FamilyMember("Josefina",47);
		FamilyMember m2 = new FamilyMember("Abelardo",45);
		FamilyMember m3 = new FamilyMember("Ataúlfo",24);
		FamilyMember m4 = new FamilyMember("Felipe",17);
		FamilyMember.setAddress("p1");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		FamilyMember.setAddress("pppp");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		
	}

}
