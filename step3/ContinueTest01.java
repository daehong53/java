public class ContinueTest01 {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=10 ; i++){
			if(i==5){
				System.out.println("i가 5일때는 넘김!");
				continue;
			}
			System.out.println("반복중입니다!");
		}
	}
}
