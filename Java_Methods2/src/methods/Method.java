package methods;

public class Method {

	//Main method - interpreter will run this first
	public static void main(String[] args) {
		System.out.println(returnTypeMethod());
		System.out.println(printProfile("james","harrison",20));
		System.out.println(addInts(10,20));
	}
	
	//return-type method
	public static String returnTypeMethod(){
		String msg = "Hello World!";
		return msg;
	}
	
	public static String printProfile(String fName, String lName,int age) {
		
		String profile = "\nUser Profile:\n"+ "Name: " + fName + " " + lName + "\nAge: " + age +"\n";
		
		return profile;
		
	}
	
	public static int addInts(int x, int y) {
		int z = x + y;
		return z;
	}
	
}

