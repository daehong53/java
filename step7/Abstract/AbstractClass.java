// 추상 클래스 (abstract class)
// 미완성 클래스, 미완성이니까 메모리 얼마나 요구한지 몰라 -> 즉 객체 못만듦 ㅋ 
// 상속받아서 완성해서 쓰라는 의미
public abstract class AbstractClass {
	int myInt;
	String myStr;
	void somePrint(){
		System.out.println("뭔가 출력하자!");
	}
	// 추상 메서드(abstract method)
	// 메서드의 명칭 + 메서드의 리턴타입 + 메서드 사용에 필요한 입력파라미터만을 정의
	// 코드블록이 X, 즉 실행될 코드는 정의되지 않은 상태
	// 미완성 메서드 -> 반드시 오버라이딩 해서 완성해서 써라~
	abstract void anotherPrint();
}
