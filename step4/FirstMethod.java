public class FirstMethod {
	

	// int		plus		(int a,	int b)
	// 리턴타입	메서드이름		파라미터/매개변수
	// { .... }
	// 메서드 실행시 사용될 코드
	// { return XXX}
	// 메서드 실행시 반환할 결과값을 위한 코드
	int plus (int a, int b){
		int result = a + b;
		return result;
	}
	
	static int add (int a, int b){
		return a+b;
	}
	
	// pop-quiz 
	// 쌤이 만든 더하긴데, 나머지 오칙 연산에 해당하는 메서드를 제작해서,
	// FirstMethodTest 클래스에서 써먹어보자.
	int minus (int a, int b){
		return a - b;
	}
	
	int gobhaki (int a, int b){
		int result = a * b;
		return result;
	}
	
	int nanooki (int a, int b){
		int result = a / b;
		return result;
	}
	
	int namuji (int a, int b){
		int result = a % b;
		return result;
	}
	
	void printPlus(int a, int b){
		System.out.println("a와 b의 합은 : " + a+b );
		if(a>b) return;
		System.out.println("a와 b의 합은 : " + a+b );
	}
	
	
	
	
	


}
