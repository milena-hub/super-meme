package domacizadatak;

import java.util.Scanner;

public class PrviZadatak {
	
	static void ucitajNiz(int []niz) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<niz.length;i++) {
		System.out.println("Unesi element:");
		niz[i]=sc.nextInt();
		}
		}
	static int nadjiNedostajuci(int a[], int n) 
    { 
        int i, sum; 
        sum = (n + 1) * (n + 2) / 2; 
        for (i = 0; i < n; i++) 
            sum -= a[i]; 
        return sum; 
    } 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		
		ucitajNiz(a);
	    int nedostajuci=nadjiNedostajuci(a, n); 
		System.out.println("Element " + nedostajuci); 
		    } 
		

	}


