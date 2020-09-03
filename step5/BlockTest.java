public class BlockTest {
	
	static{
		// 클래스당 단 한번 가장 먼저 실행되는 영역
		// static 변수 (클래스 변수) 초기화에 이용된다.
		System.out.println("클래스 초기화 블록 수행");
	}
	
	{
		// 객체가 생성될때 마다 한번씩 실행되는 영역
		// 생성자보다 먼저 실행된다
		// 인스턴스 변수 초기화에 이용된다.
		System.out.println("인스턴스 초기화 블록 수행");
	}
	
	public BlockTest(){
		// 생성자
		// 객체가 생성될때 이 생성자가 사용되면, 내부에 코드를 실행한다
		// 생성자가 사용될때마다 한번씩 실행된다.
		System.out.println("생성자 수행");
	}

	public static void main(String[] args) {
		
		System.out.println("BlockTest bt = new BlockTest()");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest()");
		BlockTest bt2 = new BlockTest();
	}
}
