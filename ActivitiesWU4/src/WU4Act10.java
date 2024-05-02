//boolean
public class WU4Act10 {
	public static void main(String[] args) {
		int i = 3;
		byte b = 5;
		float f = 1e-10f;
		double d = 3.14;
		
		boolean b1 = i > i;
		boolean b2 = i < b;
		boolean b3 = b <= f;
		boolean b4 = f >= d;
		boolean b5 = d != 0;
		boolean b6 = 1 == f;
		
		System.out.println("b1: "+i+" > "+i+" = "+b1);
		System.out.println("b2: "+i+" < "+b+" = "+b2);
		System.out.println("b3: "+b+" <= "+f+" = "+b3);
		System.out.println("b4: "+f+" >= "+d+" = "+b4);
		System.out.println("b5: "+d+" != "+0+" = "+b5);
		System.out.println("b6: "+1+" == "+f+" = "+b6);
		
	}
}
