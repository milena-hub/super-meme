package cetvrtakdomaci;

import java.util.Random;
import java.util.Scanner;

public class DrugiZadatak1 {

	public static void main(String[] args) {
		int[][] matrica = kreirajMatricu();

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite redni broj niza.");
		int red = sc.nextInt();

		int rezultat = sumaReda(matrica, red);
		System.out.println(rezultat);
		}

		public static int[][] kreirajMatricu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj kolona.");
		int kolona = sc.nextInt();
		System.out.println("Unesite broj redova.");
		int red = sc.nextInt();

		int[][] matrica = new int[red][kolona];

		Random r = new Random();

		for (int i = 0; i < red; i++) {
		for (int j = 0; j < kolona; j++) {
		matrica[i][j] = r.nextInt(100);
		}
		}
		return matrica;
		}

		public static int sumaReda(int[][] a, int n) {
		int suma = 0;
		for (int i = 0; i < a[n - 1].length; i++) {
		suma += a[n - 1][i];
		System.out.println(a[n][i]);
		}
		return suma;
		}

		

	}


