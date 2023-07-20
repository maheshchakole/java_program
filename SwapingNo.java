
public class SwapingNo {

	public static void main(String[] args) {
		int a=5 , b=9;
		System.out.println("Before Swap");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		int c;
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
