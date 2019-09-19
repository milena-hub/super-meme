package sestidomaci;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		
		 System.out.println("Unesite prvi broj");
		 int a = sc.nextInt();
		 System.out.println("Unesite drugi broj");
		 int b = sc.nextInt();
		 System.out.println("Unesite treci broj");
		 int c = sc.nextInt();
		 int minimum = Math.min(a, b);
		    int minimum2 = Math.min(minimum, c);
		 System.out.println("Minimum brojeva a, b, and c je " + minimum2);
		 
		
	}
     public static int Minimum(int a,int b,int c) {
    	 int minimum = Math.min(a, b);
		    int minimum2 = Math.min(minimum, 3);
    	 if(a<b && a<c) {
    		return a;
    		
    	 }if(b<c && b<a) {
    		return b;
    	 }else if(c<a && c<b) {
    		 return c;
    		
    	 }
    	
		return minimum2;
     }
}
