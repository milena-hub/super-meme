package domaci_13_08;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.println(tribonaci(n));

	}
	public static long tribonaci(long n) {
		if ((n == 0)) {
		return 0;
		} else if ((n == 1) || (n == 2)) {
		return 1;
		} else
		return tribonaci(n - 1) + tribonaci(n - 2) + tribonaci(n - 3);
		}

}

