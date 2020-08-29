public class ArrayTest02 {

	public static void main(String[] args) {
		String[] name;
		name = new String[3];
		
//		name[0] = new String("홍길동");
//		name[1] = new String("심청이");
//		name[2] = new String("박문수");
		
		name[0] = "홍길동";
		name[1] = "심청이";
		name[2] = "박문수";
		
		for(int i=0 ; i<name.length ; i++){
			System.out.println("name[" + i + "] : " + name[i]);
		}
	}
}
