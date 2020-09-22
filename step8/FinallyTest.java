public class FinallyTest {

	public static void main(String[] args) {
		try{
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			System.out.println("1 2 입력");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}finally{
			System.out.println("에러 발생 유무와 상관없이 수행됩니다!");
		}
		
		System.out.println("try 구문 끝!");
		
	}

}
