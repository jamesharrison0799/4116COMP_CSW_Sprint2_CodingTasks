package methods;

public class Method {

	//Main method - interpreter will run this first
	public static void main(String[] args) {
		voidMethod();
		voidMethod2("2: Hello World!");
	}
	
	//Basic void-type method
	public static void voidMethod(){
		System.out.println("1: Hello World!");
	}
	
	//Basic void type-method with string parameter
	public static void voidMethod2 (String s) {
		System.out.println(s);
	}
}


//1: Hello World!
//2: Hello World!