package probandoObjetos;

public class _BottleApp {

	public static void main(String[] args) {
		Bottle bar[]=new Bottle[5];
		bar[0] = new Bottle();
		bar[1] = new Bottle(200,"glass","green");
		bar[2] = new Bottle(120,0,"wood","brown");
		bar[3] = new Bottle();
		bar[4] = new Bottle(500,"plastic","blue");
		
		bar[3].drainBotella();
		
		Bottle.printBottleString(bar);
		System.out.println("--------------\n--------------\n--------------");
		Bottle.findEmptyBottles(bar);
		System.out.println("--------------\n--------------\n--------------");
		bar[2].llenarBotella();
		bar[3].llenarBotella();
		Bottle.findEmptyBottles(bar);

	}

}