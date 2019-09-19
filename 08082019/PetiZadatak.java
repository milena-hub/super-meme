package cetvrtakdomaci;

import java.util.Scanner;

public class PetiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite String.");

		String str = sc.nextLine();
		int[] rezultat = brojSlova(str);

		ispisiNiz(rezultat);
		sc.close();

	}

	public static int[] brojSlova(String s) {
		s = s.toLowerCase();
		int counter = 0;
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's',
				'q', 't', 'v', 'u', 'w', 'x', 'u', 'z' };
		int[] res = new int[26];

		for (int i = 0; i < alphabet.length; i++) {
			counter = 0;

			for (int j = 0; j < s.length(); j++) {

				if (alphabet[i] == s.charAt(j)) {
					counter++;
				}
			}
			res[i] = counter;
		}
		return res;
	}

	public static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

}