package fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your name:\n>>>");
		writeName(console.nextLine());
	}
	public static void writeName(String n) {
		try {
			PrintWriter write = new PrintWriter("names.txt");
			write.println(n);
			write.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
