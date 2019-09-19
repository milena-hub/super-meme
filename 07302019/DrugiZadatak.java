package sestidomaci;

import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		 
	    int n, k; 
	    double sum = 0.0;
	    System.out.print("n: ");
	    n=input.nextInt();
	 
	    System.out.print("k: ");
	    k=input.nextInt();      
	    
		System.out.println("Suma je "+sum(n,k)); 
	       // s+=(i+1)/(double)(k+i);
	   
	}
	public static double sum(int n, int k) {
		
	double sum=0.0;
	for(int i=0;i<=n; ++i)
        sum = sum + (i+1)/(double)(k+i);  
	
    return sum;
}
}

