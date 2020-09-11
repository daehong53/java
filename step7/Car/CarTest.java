public class CarTest {
	public static void main(String[] args){
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water();
		fe2 = (FireEngine) car;
		fe2.water();
		
		////////////////////////////////////////////////////
		
		// 이런 형식도 자바 문법상으로는 패스되지만
		// 실제로 실행해보면 에러난다.
		// 애초에 만들어진 메모리가 Car 타입으로 만들어져있어서
		// 어거지로 Fireengine 집어넣어도 멤버 개수가 모자라다.
		
//		Car car2 = new Car();
//		FireEngine fe3 = (FireEngine) car2;
//		fe3.water();
		
		
	}
}
