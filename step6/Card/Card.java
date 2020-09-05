package myPkg;

public class Card {
	
	int number;
	String kind;
	
	public void printCardNumber(){
		System.out.println("카드의 번호 : " + number);
	}
	
	void printCardKind(){
		System.out.println("카드의 무늬 : " + kind);
	}
	
//	abstract void printCardName();

}
