package arraylist;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<String> motorcycles = new ArrayList<String>();
		motorcycles.add("Honda");
		motorcycles.add("BMW");
		motorcycles.add("Suzuki");
		motorcycles.add("Ducati");
		motorcycles.get(0);
		motorcycles.set(2, "Lexmoto");
		motorcycles.remove(3);
		System.out.println(motorcycles);
	}
}
