package cetvrtakdomaci;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string");
		String s = sc.nextLine();
		System.out.println("Unesite karakter");
		char c = sc.next().charAt(0);
		System.out.println(brojKaraktera(s, c));

	}

	static int brojKaraktera(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
