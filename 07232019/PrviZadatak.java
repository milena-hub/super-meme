package domacizadatak;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  
		  double a, b, c, S, n, Sn;
		  n=3;
		  System.out.println("Unesite prvi broj:");
		  a = sc.nextInt();
		  System.out.println("Unesite drugi broj:");
		  b = sc.nextInt();
		  System.out.println("Unesite treci broj:");
		  c = sc.nextInt();
		  S = a + b +c;
		  Sn = S/3;
		  System.out.println("Srednja vrednost unetih brojeva je: " + Sn);
		  

	}

}
