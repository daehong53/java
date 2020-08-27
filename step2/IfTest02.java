public class IfTest02 {

	public static void main(String[] args) {
		
		int jumsoo = 87;
		
		if(jumsoo > 90){ // 91점부터 A
			System.out.println("A학점");
		}else if(jumsoo > 80){ // 81점부터 B
			System.out.println("B학점");
		}else if(jumsoo > 70){ // 71점부터 C
			System.out.println("C학점"); 
		}else if(jumsoo > 60){ // 61점부터 D
			System.out.println("D학점");
		}else{
			System.out.println("F학점");
		}
		
		System.out.println("실행 끝!");
		
		/*
		if( 캐릭살아있어? && 쿨왔어? && 게이지다찼음?){
			// 궁 발사!
		}else{
			// 캐릭이 살아있어야 사용할수 있습니다.
			// 쿨을 기다려야합니다.
			// 게이지가 다 차야 쓸수 있습니다.
		}
		*/
		/*
		if(캐릭 살아있어?){
			if(쿨 왔어?){
				
			}else{
				
			}
		}
		*/
	}
}




