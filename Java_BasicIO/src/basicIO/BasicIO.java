package basicIO;

import java.util.Scanner;

public class BasicIO {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("please enter a number\n>>>");
		int number1 = console.nextInt();
		System.out.println("please enter another number\n>>>");
		int number2 = console.nextInt();
		System.out.println(number1 + number2);
	}

}
