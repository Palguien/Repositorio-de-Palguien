
public class WU4Act11 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int i = 3;
		float a=5, b=10, c=20;
		boolean res1, res2;
		res1=!(a<b)||(b<c);
		System.out.println(!(a<b)+" OR "+(b<c));
		System.out.println("The result of the OR operator is "+res1);
		res2=!(a==b) && (b<c);
		System.out.println(!(a==b)+" AND "+(b<c));
		System.out.println("The result of the AND operator is "+res2);
		
	}
}
