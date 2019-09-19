package cetvrtakdomaci;

import java.util.Random;
import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		int[][] matrica = kreirajMatricu();
		int[] minMax = minMax(matrica);
		ispisiMinMax(minMax);

	}

	public static int[][] kreirajMatricu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj kolona.");
		int kolona = sc.nextInt();
		System.out.println("Unesite broj redova.");
		int red = sc.nextInt();

		int[][] matrica = new int[kolona][red];

		Random r = new Random();

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				matrica[i][j] = r.nextInt(100);
			}
		}
		return matrica;
	}

	public static int[] minMax(int[][] a) {
		int[] minMax = new int[2];
		int min = a[0][0];
		int max = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] <= min) {
					min = a[i][j];
				}

				if (a[i][j] >= max) {
					max = a[i][j];
				}

			}
		}

		minMax[0] = min;
		minMax[1] = max;

		return minMax;
	}

	public static void ispisiMinMax(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
	}

}
