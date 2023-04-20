package kostana.maksic;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost ugla u radijanima: ");

		double x = input.nextDouble();

		System.out.println("Sinus zadatog ugla je: " + Math.sin(x));

		System.out.println("Kosinus zadatog ugla je: " + Math.cos(x));

		input.close();
	}

}