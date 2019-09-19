package domacizadatak;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite broj");
		n = sc.nextInt();
		boolean prost = true;
		int d = n -1;
		for( ; d>1; d--) {
			if(n % d == 0) {
				prost = false;
				break;
			}
		}
		if(prost) {
			System.out.println("Broj" + n + "je prost broj");
			
		} else {
			System.out.println("Broj" + n + "nije prost broj");
		}

	}

}
