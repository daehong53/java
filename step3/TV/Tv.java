public class Tv {
	
	// Tv의 속성/값/상태/필드 : 멤버 변수
	
	String color;
	boolean power;
	int channel;
	
	// ##################################################

	// Tv의 기능/행위/행동 : (멤버) 메서드 (함수)
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
	
	void channelDown(){
		channel--;
	}
}
