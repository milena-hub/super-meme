package domacizadatak;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,sum=0,s;
		System.out.println("Unesite broj");
		n = sc.nextInt();
		s = n;
        while(n>0) {
        	m = n%10;
        	sum = (sum*10)+m;
        	n = n/10;
        }
        if(s==sum) {
        	System.out.println("Uneti broj jeste palindrom");
        }else {
        	System.out.println("Uneti broj nije palindrom");
        }
	}

}
