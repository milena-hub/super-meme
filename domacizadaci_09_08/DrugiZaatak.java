package domacizadaci_09_08;

import java.util.Scanner;

public class DrugiZaatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(longestVowel(s));
	}

	static String longestVowel(String str) {
		str += " ";
		String res = "";
		String temp = "";
		String character = "";
		String vowels = "aeiou";
		

		for (int i = 0; i < str.length(); i++) {

			character = Character.toString(str.charAt(i));
			if (vowels.contains(character)) {
				temp += character;
			} else {
				if (res.length() <= temp.length()) {
					res = temp;
					
				}
				temp = "";
			}
		}
		return res;
	}


	}


