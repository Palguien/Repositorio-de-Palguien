package probandoObjetos;

public class BankClient {
	//atributes
	private String name;
	public float balance;
	private static float profit = 0;
	//constructor
	public BankClient(String name) {
		setName(name);
		setBalance(0);
	}
	//methods
	/**
	 * pasa los atributos a un string
	 */
	@Override
	public String toString() {
		return ">>Name: "+getName()+" Balance: "+getBalance()+" Profit:"+getProfit();
	}
	/**
	 * añade la cantidad indicada a la cuenta
	 * @param money
	 * @throws IllegalArgumentException si se introduce un negativo
	 */
	public void entry(float money) {
		if(money<0) {
			throw new IllegalArgumentException("Solo positivos");
		}
		setBalance(getBalance()+money);
	}
	/**
	 * retira la cantidad indicada de la cuenta (solo positivos)
	 * @param money
	 * @throws IllegalArgumentException si se introduce un negativo
	 * @throws IllegalArgumentException si se intenta retirar más dinero del que hay en la cuenta
	 */
	public void retirar(float money){
		if(money<0) {
			throw new IllegalArgumentException("Solo positivos");
		}
		if(money>getBalance()) {
			throw new IllegalArgumentException("No puedes retirar más dineros de los que tienes");
		}
		setBalance(getBalance()-money);
	}
	//get y set
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	private void setBalance(float balance) {
		this.balance = balance;
	}

	public static float getProfit() {
		return profit;
	}

	public static void setProfit(float profit) {
		BankClient.profit = profit;
	}

}
