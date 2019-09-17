package domaci_matrica;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dimenziju kvadratne matrice (n): ");
		int n = sc.nextInt();

		int[][] matrica = new int[n][n];
		generisiElementeMatrice(matrica, 100);
		System.out.println("Matrica izgleda ovako: ");
		ispisiMatricu(matrica);
		System.out.println();

		int[] elementiNaglavnoj = elementiNaGlavnojDijagonali(matrica);
		System.out.println("Elementi na glavnoj dijagonali su: ");
		if (elementiNaglavnoj != null)
		ispisiNiz(elementiNaglavnoj);
		else
		System.out.println("Greska u funkciji elementiNaGlavnojDijagonali");
		System.out.println();

		System.out.println("Elementi na sporednoj dijagonali su: ");
		int[] elementiNaSporednoj = elementiNaSporednojDijagonali(matrica);
		if (elementiNaSporednoj != null)
		ispisiNiz(elementiNaSporednoj);
		else
		System.out.println("Greska u funkciji elementiNaSporednojDijagonali");
		System.out.println();

		System.out.println("Elementi iznad glavne dijagonale su: ");
		ispisiElementeIznadGlavneDijagonale(matrica);
		System.out.println();

		System.out.println("Elementi ispod glavne dijagonale su: ");
		ispisiElementeIspodGlavneDijagonale(matrica);
		System.out.println();

		int[][] transponovanaMatrica = transponujMatricu(matrica);
		System.out.println("Transponovana matrica izgleda ovako: ");
		if (transponovanaMatrica != null)
		ispisiMatricu(transponovanaMatrica);
		else
		System.out.println("Greska u funkciji transponujMatricu.");
		System.out.println();

		System.out.println("Pre uklanjanja duplih elemenata niz izgleda ovako: ");
		ispisiNiz(elementiNaglavnoj);
		System.out.println();

		elementiNaglavnoj = ukloniElementeKojiSePonavljajuUnizu(elementiNaglavnoj);
		System.out.println("Nakon uklanjanja duplih elemenata niz izlgeda ovako: ");
		if (elementiNaglavnoj != null)
		ispisiNiz(elementiNaglavnoj);
		else
		System.out.println("Greska u funkcji ukloniElementeKojiSePonavljajuUnizu");

		}

		public static void generisiElementeMatrice(int[][] matrica, int gornjaGranica) {
		Random r = new Random();

		for (int i = 0; i < matrica[0].length; i++) {
		for (int j = 0; j < matrica.length; j++) {
		int broj = r.nextInt(gornjaGranica);
		matrica[i][j] = broj;
		}

		}
		}

		public static void ispisiMatricu(int[][] matrica) {
		for (int i = 0; i < matrica[0].length; i++) {
		for (int j = 0; j < matrica.length; j++) {
		System.out.print(matrica[i][j] + " ");
		}
		System.out.println();
		}

		}

		public static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
		System.out.print(niz[i] + " ");
		}

		}

		public static int[] elementiNaGlavnojDijagonali(int[][] matrica) {
		int[] elementiNaGlavnoj = new int[matrica[0].length];
		for (int i = 0; i < matrica[0].length; i++) {

		elementiNaGlavnoj[i] = matrica[i][i];

		}
		return elementiNaGlavnoj;
		}

		public static int[] elementiNaSporednojDijagonali(int[][] matrica) {
		int[] elementiNaSporednoj = new int[matrica[0].length];
		for (int i = 0; i < matrica[0].length; i++) {

		elementiNaSporednoj[i] = matrica[i][matrica[0].length - 1 - i];

		}
		return elementiNaSporednoj;
		}

		public static int[][] transponujMatricu(int[][] matrica) {
		int transponovanaMatrica[][] = new int[matrica.length][matrica[0].length];
		for (int i = 0; i < (matrica.length); i++) {
		for (int j = 0; j < (matrica.length); j++) {
		transponovanaMatrica[i][j] = matrica[j][i];

		}
		}
		return transponovanaMatrica;
		}

		public static void ispisiElementeIznadGlavneDijagonale(int[][] matrica) {
		for (int i = 0; i < matrica[0].length; i++) {
		for (int j = 0; j < matrica.length; j++) {
		if (i < j) {
		System.out.print(matrica[i][j] + " ");
		}else {
		System.out.print("  ");
		}
		}
		System.out.println();
		}
		}

		public static void ispisiElementeIspodGlavneDijagonale(int[][] matrica) {
		for (int i = 0; i < matrica.length; i++) {
		for (int j = 0; j <= matrica[0].length; j++) {
		if (i > j) {
		System.out.print( matrica[i][j] + " ");

		}
		}
		System.out.println();
		}
		}

		public static int[] ukloniElementeKojiSePonavljajuUnizu(int[] niz) {
	        int brojElemenataBezPonavljanja = niz.length;
	        for (int i = 0; i < brojElemenataBezPonavljanja; i++) {
	            for (int j = i + 1; j < brojElemenataBezPonavljanja; j++) {
	                if (niz[i] == niz[j]) {
	                    niz[j] = niz[brojElemenataBezPonavljanja - 1];
	                    brojElemenataBezPonavljanja--;
	                    j--;
	                }
	            }
	        }
	        int[] nizBezPonavljanja = Arrays.copyOf(niz, brojElemenataBezPonavljanja);
	        return nizBezPonavljanja;
	    }
	



	}


