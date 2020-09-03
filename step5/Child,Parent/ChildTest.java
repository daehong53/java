public class ChildTest {
	public static void main(String[] args) {
		Parent myParent = new Parent();
		Child myChild = new Child();
		
		myParent.age = 50;
		myParent.printAge();
//		myParent.play();
		
		myChild.age = 20;
		myChild.printAge();
		myChild.play();
		
//		Parent myParent2 = new Child();
		Parent myParent2;
		Child myChild2 = new Child();
		myParent2 = myChild2;
		
		long myLong;
		int myInt = 13;
		myLong = myInt;
		
		
		
		
		
	}

}
