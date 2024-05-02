package test;

public class SplitPrueba {

	public static void main(String[] args) {
		String str = "12 34 56 98";
		//division basica
		//String[] parts = str.split(" ");
		//division basica, longitud maxima (3 parts)
		String[] parts = str.split(" ",3);
		//division multiple
		//String[] parts = str.split("/-");
		//division basica varias opciones
		//String[] parts = str.split("[/-]");
		//divisiones multiples
		//String[] parts = str.split("##|aw");
		for (String string : parts) {
			System.out.println(string);
		}
	}
}
