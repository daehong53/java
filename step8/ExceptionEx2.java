public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0 ; i<10 ; i++){
			try{
				result = number / (int) (Math.random() * 10);
				System.out.println(result);
			}catch(ArithmeticException e){
				System.out.println("0으로 나눈 케이스는 그냥 넘어감!");
			}catch(Exception e){
				System.out.println("뭔지 모르겠지만, 하이튼 에러임!");
			}
		}
	}
}
