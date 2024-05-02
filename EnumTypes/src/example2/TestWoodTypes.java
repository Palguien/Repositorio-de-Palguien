package example2;

public class TestWoodTypes {
	public static void main(String[] args) {
		float palet=2.27f;
		for (WoodType aux : WoodType.values()) {
			System.out.println(aux+"--> Color:"+aux.getColor()+", Density:"+aux.getDensity());
			System.out.println("El palet pesa: "+palet*aux.getDensity()+"KG");
		}
	}
}
