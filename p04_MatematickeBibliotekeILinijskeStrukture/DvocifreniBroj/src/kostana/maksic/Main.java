package kostana.maksic;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Cifre dvocifrenog broja ");
		System.out.print("Dvocifreni broj: ");

		int a = input.nextInt();
		int d, j;

		d = a / 10;
		j = a % 10;

		System.out.println("broj = " + a + " " + "cifra jedinica = " + j + " " + "cifra desetica = " + d);
		System.out.println(10 * j + d);

		input.close();
	}
}