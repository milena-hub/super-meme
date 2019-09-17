package domacizadaci_09_08;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		System.out.println(kompresuj(test));

	}

	public static String kompresuj(String tekst) {
		String rezultat = "";

		int index = 0;

		while (index < tekst.length()) {
			char c = tekst.charAt(index);
			int count = count(tekst, index);
			if (count <= 3)
				rezultat += "" + c;
			else
				rezultat += "" + count + c;
			index += count;
		}

		return rezultat;
	}

	public static int count(String tekst, int index) {
		char c = tekst.charAt(index);
		int i = 1;
		while (index + i < tekst.length() && tekst.charAt(index + i) == c)
			i++;
		return i;
	}

	

	}


