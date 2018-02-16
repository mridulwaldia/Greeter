
public class Greeter {

	private String name;
	private int age;
public Greeter(){
	
}

public Greeter(String xName, int xAge){
	name = xName;
	age = xAge;
}

public String toString(){
	return "Greeter" + "Name: " + name + "Age: " + age;
}


}


