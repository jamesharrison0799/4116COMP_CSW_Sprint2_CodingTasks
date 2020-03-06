package arraylist;

import java.util.ArrayList;

public class ArrayLists_Loop {
	public static void main(String[] args) {
		ArrayList<String> motorcycles = new ArrayList<String>();
		motorcycles.add("Honda");
		motorcycles.add("BMW");
		motorcycles.add("Suzuki");
		motorcycles.add("Ducati");
		
		//For loop
		for(int i = 0; i < motorcycles.size(); i++) {
			System.out.println(motorcycles.get(i));
		}
		
		//For Each Loop
		for(String i: motorcycles) {
			System.out.println(i);
		}
		
	}
}

//Honda
//BMW
//Suzuki
//Ducati
//Honda
//BMW
//Suzuki
//Ducati
