public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] score;
		score = new int[5];
		
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
		
		
		System.out.println(score[0]);
		
		for(int i=0 ; i<5 ; i++){
			System.out.println(score[i]);
		}

	}

}
