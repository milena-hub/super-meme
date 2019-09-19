package domacizadatak;

import java.util.Random;
import java.util.Scanner;

public class DrugiZadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza");
		int velicinaNiza = sc.nextInt();
		int[] niz = new int[velicinaNiza];

		System.out.println("Unestite gornju granicu niza.");
		int najvecaVrednost = sc.nextInt();

		Random randomGenerator = new Random();
		for (int idx = 0; idx < velicinaNiza; idx++) {
		int randomInt = randomGenerator.nextInt(najvecaVrednost + 1);

		niz[idx] = randomInt;
		}

		System.out.println(" Unesite broj za proveru.");
		int trazeniBroj = sc.nextInt();

		for (int idx = 0; idx < velicinaNiza; idx++) {
		if (trazeniBroj == niz[idx]) {
		System.out.println("Broj " + trazeniBroj + " je pronadjen.");
		return;
		}
		}
        	
        System.out.println("Broj nije pronadjen");
        sc.close();

}
}