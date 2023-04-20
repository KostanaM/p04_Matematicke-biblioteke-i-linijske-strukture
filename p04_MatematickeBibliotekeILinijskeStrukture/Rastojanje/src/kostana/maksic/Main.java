package kostana.maksic;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite koordinate prve tačke: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double a1 = Math.sqrt(x1 * x1 + y1 * y1);

		// koristeci math-formulu za izracunavanje hipotenuze:
		double z = Math.hypot(x1, y1);

		System.out.println("Unesite koordinate druge tačke: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double a2 = Math.sqrt(x2 * x2 + y2 * y2);

		// koristeci math-formulu za izracunavanje hipotenuze:
		double q = Math.hypot(x2, y2);

		System.out.println("Rastojanje prve tačke (" + x1 + "," + y1 + ") od koordinatnog početka je " + df.format(a1));
		System.out
				.println("Rastojanje druge tačke (" + x2 + "," + y2 + ") od koordinatnog početka je " + df.format(a2));

		System.out.println("Rastojanje prve tačke (" + x1 + "," + y1 + ") od koordinatnog početka je " + df.format(z));
		System.out.println("Rastojanje druge tačke (" + x2 + "," + y2 + ") od koordinatnog početka je " + df.format(q));

		input.close();
	}

}