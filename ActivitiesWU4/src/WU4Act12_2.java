
public class WU4Act12_2 {
	public static void main(String[] args) {
		boolean res1=((4-2)*(5+1)/2)>2-(4+3);
		boolean res2=((6+3)>8 && ((6-1)*2<8 || 2*3==8));
		int x = 7;
		int z = 2;
		boolean res3=((1.0<x && (x<z+7.0)));
		x = 1;
		z = 10;
		int y=4;
		final double PI = 3.14;
		boolean res4=(PI*(x^2)>y || 2*PI*x<=z);
		boolean res5=(x>3 && y==4 || x+y<=z);
		boolean res6=(x>3 && (y==4 || x+y<=z));
		System.out.println("a)"+res1);
		System.out.println("b)"+res2);
		System.out.println("c)"+res3);
		System.out.println("d)"+res4);
		System.out.println("e)"+res5);
		System.out.println("e)"+res6);

	}
}
