package domacizadatak;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		for(int i =1; i<6; ++i) {
			System.out.println("Ukucaj broj:");
			n = sc.nextInt();
			if(n==0) {
				continue;
			} else if(n<0) {
				break;
				
			}
			
			 sum += n;
		}
		System.out.println("Sum = " + sum);
		//System.out.println("Pogresno");
	}
	

}


