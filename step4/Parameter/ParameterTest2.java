public class ParameterTest2 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() x : " + d.x); // 10
		
		change(d); // 0x100
		System.out.println("After change(d)");
		System.out.println("main() x : " + d.x); // 1000
	}
	
	static void change(Data d){
		//             Data d = 바깥에 d
		//                    = 0x100;
		d.x = 1000;
		System.out.println("change() x : " + d.x); // 1000
	}

}
