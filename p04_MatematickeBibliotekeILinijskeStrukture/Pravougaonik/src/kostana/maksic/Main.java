package kostana.maksic;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost stranice pravougaonika a: ");

		Double a = input.nextDouble();

		System.out.println("Unesite vrednost stranice pravougaonika b: ");

		double b = input.nextDouble();

		System.out.println("Dijagonala pravougaonika je: " + Math.sqrt(a * a + b * b));

		input.close();
	}

}