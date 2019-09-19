package domacizadatak;

import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,sum=0;
		System.out.println("Unesite prvi broj");
		m = sc.nextInt();
		System.out.println("Unesite drugi broj");
		n = sc.nextInt();
		if(n<m) { int t = m; m=n; n=t; 
		}
		 
		for (int i =m ; i<n ;i++)
		{
		if(i%2 == 0) {
			System.out.println(i);
			sum=i + sum;
		}
			
		    
		
		}
		
		System.out.println("Suma parnih brojeva izmeðu broja "+m+" i broja "+n+" je: "+sum);
		 
		}
		}