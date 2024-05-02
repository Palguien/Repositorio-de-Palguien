
public class Ut4Act9 {
	//Don't do this bullshit :)
	public static void main(String[] args) {
		float a = 11, e = 7;
		float b = 0, c = 0, d = 0;
		b=c=d=a;
		System.out.println("Assignment += "+(a+=e));
		System.out.println("Assignment -= "+(b-=e));
		System.out.println("Assignment *= "+(c*=e));
		System.out.println("Assignment /= "+(d/=e));
		//**********************************************
		//Use this instead
		//**********************************************
		b=a;
		c=a;
		d=a;
		
		a+=e;//a=a+e
	}
}
