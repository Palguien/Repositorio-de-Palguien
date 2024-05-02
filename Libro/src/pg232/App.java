package pg232;

public class App {

	public static void main(String[] args) throws LengthException {
		Texto text = new Texto(20);	
		text.addCadenaFin("hola");
		System.out.println(text);
		text.addCadenaFin("capullo");
		System.out.println(text);
		text.addCadenaIni("aaa");
		System.out.println(text);
		text.addCharIni('I');
		text.addCharFin('F');
		System.out.println(text);
		System.out.println(text.countVocales());
	}

}
