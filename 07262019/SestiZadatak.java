package domacizadatak;

import java.util.Scanner;

public class SestiZadatak {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, fn, fn1, fn2;
		System.out.println("Unesite broj n");
		n = scanner.nextInt();
		fn = 0;
		if (n == 0) {
			fn = 0;
		} else if (n == 1) {
			fn = 1;
		} else {
			fn2 = 0;
			fn1 = 1;

			for (int i = 2; i <= n; i++) {
				fn = fn2 + fn1;
				fn2 = fn1;
				fn1 = fn;
			}
		}
		System.out.print("Fibonacijev broj je " + fn);
	}
}
