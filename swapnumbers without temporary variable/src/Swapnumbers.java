
public class Swapnumbers {

	public static void main(String[] args) {
		float first= 12.0f,second = 24.5f;
		
		System.out.println("--Beforeswap--");
		System.out.println("first number ="+first);
		System.out.println("second number ="+second);
		
		first = first - second;
		second = first + second;
		first = second - first;
		
		System.out.println("--Afterswap--");
		System.out.println("first number="+ first);
		System.out.println("second number="+second);

	}

}
