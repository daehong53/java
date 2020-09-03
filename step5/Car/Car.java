public class Car {
	String	color		; // 색상	
	String	gearType	; // 기어의 종류 auto/stick
	int		door		; // 문 개수
	
	Car(){
		this("White", "auto", 4); // 나 말고 다른 종류의 생성자를 실행하겠다.
//		Car("White", "auto", 4);
	}
	
	Car(String color){
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door){
		//   = "White"    = "auto"        = 4
		//   = "Blue"     = "auto"        = 4
		this.color 		= color		; // "White"
		this.gearType 	= gearType	; // "auto"
		this.door 		= door		; // 4
	}
	
	/*
	// 만약 인스턴스 변수와, 지역변수의 이름이 겹치지 않는다면, 굳이 this. 쓰지 않아도된다.
	Car(String c, String g, int d){
		color 		= c		; 
		gearType 	= g	; 
		door 		= g		; 
	}*/
	
	
	
}
