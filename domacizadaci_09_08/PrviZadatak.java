package domacizadaci_09_08;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string");
		String rec = sc.nextLine();
		String recBezRazmaka = rec.replaceAll(" ", "").toLowerCase();

		if (jePalindrom(recBezRazmaka)) {
			System.out.println("Jeste palindrom");
		} else {
			System.out.println("Nije palindrom");
		}
	}

	public static boolean jePalindrom(String reci) {
		int d = reci.length() / 2;
		for (int i = 0; i < d; i++) {
			if (reci.charAt(i) != reci.charAt(reci.length() - 1 - i)) {
				return false;
			}

		}
		return true;

	}

	}


