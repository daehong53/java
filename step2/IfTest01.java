public class IfTest01 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		// 단일 if
		if(num1 > num2){
			System.out.println("num1이 num2보다 크다");
		}
		
		System.out.println("실행 끝!");
		
		// if, else 구문
		if(num1 < num2){
			System.out.println("num1은 num2보다 작다");
		}else{
			System.out.println("num1은 num2보다 작지 않다");
		}
	}
}
