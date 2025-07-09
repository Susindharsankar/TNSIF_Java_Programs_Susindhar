package interfacedemo;

public class FunctionalDemo {
	
	public static void main(String[] args) {
		
		//Lambda expression
		GreetingDemo gd = () ->
		System.out.println("Hello Welcome to the java session");
		gd.greet();
		
		
	}

}

