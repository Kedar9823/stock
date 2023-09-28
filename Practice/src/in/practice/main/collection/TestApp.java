package in.practice.main.collection;

public class TestApp {
	public static void main(String[] args) {
		
		Adder adder = (a, b) -> a + b;
		
		int result = adder.add(5, 6);
		
		System.out.println("Addition: "+result);
	}
	
}

interface Adder {
    int add(int a, int b);
}
