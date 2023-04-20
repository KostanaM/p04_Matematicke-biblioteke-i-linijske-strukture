package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws Exception {
		// A-povrsina poprecnog preseka stapa
				// L-duzina stapa
				// E-modul elasticnosti materijal
				// deltaL-izduzenje stapa
				// deltaA-kontrakcija
				// F-intenzitet aksijalne sile
				// mi-Poasonov koeficijent

				double A, L, E, deltaL, deltaA, F, mi;

				DecimalFormat df = new DecimalFormat("#.##");

				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				// unos podataka

				System.out.println("Unesite vrednost površine poprečnog štapa A: ");
				A = Double.parseDouble(ulaz.readLine());

				System.out.println("Unesite vrednost dužine štapa L(cm): ");
				L = Double.parseDouble(ulaz.readLine());

				System.out.println("Unesite vrednost modula elastičnosti E: ");
				E = Double.parseDouble(ulaz.readLine());

				System.out.println("Unesite vrednost izduženja štapa (cm): ");
				deltaL = Double.parseDouble(ulaz.readLine());

				System.out.println("Unesite vrednost kontrakcije(cm): ");
				deltaA = Double.parseDouble(ulaz.readLine());

				// Izračunavanje vrednosti inteziteta aksijalne sile i Poasonovog koeficijenta
				F = A * E * deltaL / L;
				mi = L * deltaA / (A * deltaL);

				// Štampanje rezultata
				System.out.println("Intenzitet aksijalne sile je F= " + df.format(F) + " kN/n/"
						+ "\nVrednost Poasonovog koeficijenta je " + df.format(mi));

			}

		}
