package domacizadatak;

import java.util.Scanner;

public class PetiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite stranicu kvadrata");
		int n;
		n = sc.nextInt();
	    for (int i=1; i<= n; i++){
	        for (int j=1; j<= n; j++){
	            System.out.print(" * ");
	        }
	        System.out.println();

	}

	}
	
}


