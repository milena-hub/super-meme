package ProblemSpecijalnihPopusta;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza: ");
		int n = sc.nextInt();
		int[] nizBrojeva = ucitajNiz(n);

		System.out.println(aritmetickaSredina(nizBrojeva));
		System.out.println(medijana(nizBrojeva));

	}

	public static int[] ucitajNiz(int n) {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[n];
		System.out.println("Unesite elemente niza redom: ");
		for (int i = 0; i < n; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static double aritmetickaSredina(int[] niz) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < niz.length; i++) {
			sum += niz[i];
		}
		avg = sum / niz.length;
		return avg;
	}

	public static int medijana(int[] niz) {
		int medijana = 0;
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				int a = niz[i];
				int b = niz[j];
				if (b < a) {
					niz[j] = a;
					niz[i] = b;
				}
			}

		}
		if (niz.length % 2 == 0) {
			medijana = (niz[(niz.length - 1) / 2] + niz[niz.length / 2]) / 2;
		} else {
			medijana = niz[(niz.length - 1) / 2];
		}
		return medijana;
	}

}
