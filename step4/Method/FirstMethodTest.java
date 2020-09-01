public class FirstMethodTest {

	public static void main(String[] args) {
		
		
		FirstMethod.add(10, 3);
		
		FirstMethod myFirstMethod = new FirstMethod();
		
		System.out.println(	myFirstMethod.plus(10, 3)	);
		
		int num = myFirstMethod.plus(3, 9);
		long myLong = myFirstMethod.plus(3, 9);
		byte myByte = (byte) myFirstMethod.plus(3, 9);
		
		System.out.println( (myFirstMethod.plus(3, 9))*10   );
		
		System.out.println( myFirstMethod.minus(10, 3));
		System.out.println( myFirstMethod.gobhaki(10, 3));
		System.out.println( myFirstMethod.nanooki(10, 3));
		System.out.println( myFirstMethod.namuji(10, 3));
		
		// void 메서드는 리턴타입이 없으므로 대입불가
		//int num = myFirstMethod.printPlus(10, 3); 
		
	}

}
