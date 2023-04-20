package kostana.maksic;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Trocifreni broj: ");

		int broj = input.nextInt();

		int s, d, j;

		s = broj / 100; // cifra stotica
		d = (broj % 100) / 10; // cifra desetica
		j = broj % 10; // cifra jedinica

		System.out.println(
				"broj= " + broj + "\tcifra stotica: " + s + "\tcifra desetica: " + d + "\tcifra jedinica: " + j);

		input.close();
	}

}
