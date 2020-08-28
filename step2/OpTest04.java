public class OpTest04 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		
		boolean bool1 = num1 >  num2; // t
		boolean bool2 = num1 <  num2; // f
		boolean bool3 = num1 == num2; // f
		boolean bool4 = num1 != num2; // t
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		
		System.out.println( bool1 && bool2 ); // f
		System.out.println( bool1 || bool2 ); // t
		System.out.println( bool1 && bool4 ); // t
		System.out.println( bool2 || bool3 ); // f
		
		System.out.println( (num1 > num2) && (num1 < num2) || (num1==num2) );
		
	}

}
