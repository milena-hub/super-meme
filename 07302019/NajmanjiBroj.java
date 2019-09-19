package vezba;

import java.util.Scanner;

public class NajmanjiBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
			
		 System.out.println("Unesite prvi broj");
		 int a = sc.nextInt();
		 System.out.println("Unesite drugi broj");
		 int b = sc.nextInt();
		 System.out.println("Unesite treci broj");
		 int c = sc.nextInt();
		 int d = najmanji(a,b,c);
		 System.out.println("Najmanji broj je:" + d);
	}
    public static int najmanji(int a, int b, int c) {

    	 if(a<b && a<c) {
     		return a;
     		
     	 }if(b<c && b<a) {
     		return b;
     	 }else if(c<a && c<b) {
     		 return c;
     		
     	 }
     	
 		int d = 0;
		return d;
      }

    }

