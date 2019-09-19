package sestidomaci;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Unesite broj");
	        int n = input.nextInt();
	        
	        stampajTrougao(n);

	}
	public static void stampajTrougao(int n) {
		 for (int i = 1; i <= n; i++) {
        	 
	            for (int j = 0; j < i; j++) {
	                System.out.print("* ");             
	            }
			System.out.println();
		}
	}

}
