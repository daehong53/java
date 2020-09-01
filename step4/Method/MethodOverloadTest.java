public class MethodOverloadTest {

	public static void main(String[] args) {
		MethodOverload test = new MethodOverload();
		System.out.println( test.plus(10, 3));
		System.out.println( test.plus(10, 3, 7));
		System.out.println( test.plus(3.14, 3.14));
	}

}
