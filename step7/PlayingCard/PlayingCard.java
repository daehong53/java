public interface PlayingCard {
	
	// 자바에서는 final로 선언되는 변수는 다 대문자로 쓴다.
	// 일반변수:myStudent / final 변수 : MY_STUDENT
	public static final int SPADE = 4;
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	// 인터페이스는 매우 특이한 형태의 데이터타입
	// 인터페이스 내에 선언되는 모든 변수는 다 기본적으로 public static final 로 선언된다 (생략가능)
	
	public abstract String getCardNumber();
	String getCardKind();
	// 인터페이스 내에 정의되는 모든 메서드는 기본적으로 public abstract 로 선언된다 (생략가능)
	

}
