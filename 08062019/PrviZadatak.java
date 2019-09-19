package domacizadatak;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int a[]= new int[n];
		ucitajNiz(a);
		proveriBroj(a,c);
	}
		static void ucitajNiz(int []niz) {
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<niz.length;i++) {
			System.out.println("Unesi element:");
			niz[i]=sc.nextInt();
			}
		}
		static void proveriBroj(int[] niz, int c) {
			
			boolean test = false; 
	        for (int element : niz) { 
	            if (element == c) { 
	                test = true; 
	                break; 
	            } 
	        } 
	  
	        // Print the result 
	        System.out.println("Da li je " + c
	                           + " u nizu: " + test); 
	    } 
	}


