package loops;

public class ForEach {

	public static void main(String[] args) {
		/*
		 * For Loop Syntax
		 * 
		 * 
		 * for( type variableName : arrayName ){
		 *  //code block to be executed 
		 * }
		 */
		
		String[] motorcycles = {"Honda", "BMW", "Suzuki", "Ducati"};
		for (String i : motorcycles) {
		  System.out.println(i);
		}

	}

}
