package probandoObjetos;

public class _ProbandoClases {

	public static void main(String[] args) {
		
		BankClient Abelardo = new BankClient("Abelardo");
		addMoney(Abelardo,100);
		System.out.println(Abelardo.toString());
		try{
			Abelardo.retirar(10);
		}catch(IllegalArgumentException exception) {
			System.err.println("No puedes retirar más dineros de los que tienes, DICKWEED");
		}
		System.out.println(Abelardo.toString());
	}
	
	public static void addMoney(BankClient cli, float money) {
		try{
			cli.entry(money);
		}catch(IllegalArgumentException exception) {
			System.err.println("No negativos, DICKWEED");
		}
		
	}
	
}