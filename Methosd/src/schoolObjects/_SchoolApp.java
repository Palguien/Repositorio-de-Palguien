package schoolObjects;

public class _SchoolApp {

	public static void main(String[] args) {
		Alumno clase[]=new Alumno[3];
		Alumno bruno = new Alumno("Bruno",13);
		System.out.println(bruno.toString());
		Alumno wamba = new Alumno();
		wamba.visualizeData();
		wamba.initializeData();
		wamba.visualizeData();
		clase[0]=bruno;
		clase[1]=wamba;
		clase[2]=new Alumno("Chindasvinto",17);
		System.out.println("---------------------------------");
		clase[0].visualizeData();
		clase[1].visualizeData();
		clase[2].visualizeData();
		System.out.println("Oldest:");
		olderStudent(clase).visualizeData();
	}

	private static Alumno olderStudent(Alumno[] clase) {
		int max=0;
		Alumno oldest = null;
		for (int i = 0; i < clase.length; i++) {
			if(clase[i].getAge()>max) {
				max=clase[i].getAge();
				oldest=clase[i];
			}
		}
		return oldest;
	}

}
