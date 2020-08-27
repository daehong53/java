public class ForTest01 {

	public static void main(String[] args) {
		
		int num = 2;
		
		// (반복기준변수; 반복조건식 ; 반복종료증감식)
		for(int i=1 ; i<=5   ; i++       ){
		// i:1 -> i<=5:true -> 안에 코드 실행 -> i++
		// i:2 -> i<=5:true -> 안에 코드 실행 -> i++
		// i:3 -> i<=5:true -> 안에 코드 실행 -> i++
		// i:4 -> i<=5:true -> 안에 코드 실행 -> i++
		// i:5 -> 5<=5:true -> 안에 코드 실행 -> i++
		// i:6 -> i<=5 6<=5:false -> 조건식의 결과가 false이므로 반복 종료
			System.out.println("이 문장은 다섯번 출력됩니다. 현재 i값 : " + i);
		}
		
		for(int i=1 ; i<=9 ; i++){
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
		
		
	}

}
