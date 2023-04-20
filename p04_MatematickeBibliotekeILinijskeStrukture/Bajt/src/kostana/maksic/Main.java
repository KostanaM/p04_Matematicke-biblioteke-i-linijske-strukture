package kostana.maksic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Pretvaranje veličine memorije iz kilobajta u bajte");
		System.out.println("Veličina datoteke u kolobajtima: ");

		int kb = input.nextInt();

		System.out.print("Veličina datoteke u bajtima: " + kb * 1024);

		input.close();
	}

}
