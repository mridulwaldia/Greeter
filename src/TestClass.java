
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeter bob = new Greeter();
		System.out.println(bob.toString());
		
		Greeter[] bill = new Greeter[10];
		for(int i = 0; i < 10; i++){
			System.out.println(bill[i].toString());
		}
	}

}
