package domacizadatak;

import java.util.Scanner;

public class TreciZadatak {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza");
		int velicinaNiza = sc.nextInt();
		int[] niz = new int[velicinaNiza];
		ucitajNiz(niz);
		stampajVece(niz);
		najbliziAritmetickoj(niz);

	}

	static void ucitajNiz(int[] niz) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element:");
			niz[i] = sc.nextInt();
		}
	}

	static void stampajVece(int[] niz) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < niz.length; i++) {
			sum += niz[i];
		}
		avg = sum / niz.length;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > avg) {
				System.out.print(niz[i] + " ");
			}
			
		}
		System.out.println("");
	}

	static void najbliziAritmetickoj(int[] niz) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < niz.length; i++) {
			sum += niz[i];
		}
		avg = sum / niz.length;

		int temp = 0;
		int najblizi = niz[0];

		for (int i = 0; i < niz.length; i++) {
			temp = niz[i];

			if (Math.abs(temp - avg) <= Math.abs(najblizi - avg)) {
				najblizi = temp;

			}

		}

		System.out.println("Broj najblizi aritmetickoj sredini je: " + najblizi);

	}

}