package estructurasDinamicas;
import java.util.*;

public class AppEjer1 {

	public static void main(String[] args) {
		Socio s1=new Socio(5,"Pepe","29-03-2024");
		Socio s2=new Socio(2,"María","10-01-2023");
		Socio s3=new Socio(6,"Luis","15-02-2020");
		Socio s4=new Socio(5,"Oscar","18-12-2020");
		int resultado;
//		resultado=s1.compareTo(s3);
//		System.out.println("Comparación: "+resultado);
//		resultado=s1.compareTo(s2);
//		System.out.println("Comparación: "+resultado);
//		resultado=s1.compareTo(s2);
//		System.out.println("Comparación: "+resultado);
//		resultado=s1.compareTo(s4);
//		System.out.println("Comparación: "+resultado);
//		System.out.println("Socio 6:"+s4.toString());
		
		int[] vector= {9,4,6,2};
		Arrays.sort(vector);
		System.out.println(Arrays.toString(vector));
		
		//tabla de socios
		Socio club[]=new Socio[]{
			new Socio(5,"Pepe","29-03-2024"),
			new Socio(2,"María","10-01-2023"),
			new Socio(6,"Luis","15-02-2020")		
		};
		
		Arrays.sort(club);
		System.out.println(Arrays.toString(club));
		System.out.println("Otro método:" +Arrays.deepToString(club));
		
		//Uso de la clase comparadora de edades
		ComparaEdades c=new ComparaEdades();
		Arrays.sort(club,c);
		System.out.println(Arrays.toString(club));
		
		//Uso de la clase comparadora de nombres
		ComparaNombres c2=new ComparaNombres();
		Arrays.sort(club,c2);
		System.out.println(Arrays.toString(club));
		
	}

}
