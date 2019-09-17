package domaci_13_08;

import java.util.Random;
import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		System.out.println("Kreraj prvi niz");
		int[] niz1 = kreirajNiz();
		System.out.println("Kreraj drugi niz");
		int[] niz2 = kreirajNiz();

		ispisiNiz(niz1);
		ispisiNiz(niz2);

		boolean rezultat = podskup(niz1, niz2);

		if (rezultat == true) {
		System.out.println("Manji skup je podskup veceg skupa.");
		} else {
		System.out.println("Manji skup nije podskup veceg skupa.");
		}

		}

		public static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
		System.out.print(niz[i] + " ");
		}
		System.out.println();
		}

		public static int[] kreirajNiz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dimenziju niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];

		Random r = new Random();
		for (int i = 0; i < n; i++) {
		niz[i] = r.nextInt(10);
		}

		return niz;
		}


		public static boolean podskup(int[] A, int[] B) {
			int[] veciNIz;
			int[] manjiNiz;
			int brojac = 0;

			if (A.length > B.length) {
			veciNIz = A;
			manjiNiz = B;
			} else {
			veciNIz = B;
			manjiNiz = A;
			}

			outer: for (int i = 0; i < manjiNiz.length; i++) {

			for (int j = 0; j < veciNIz.length; j++) {

			if (manjiNiz[i] == veciNIz[j]) {
			brojac++;
			continue outer;
			}

			}

			}
			if (brojac < manjiNiz.length) {
			return false;
			} else {
			return true;
			}
			}
	}

			

	


