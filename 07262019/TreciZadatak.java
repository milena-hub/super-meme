package domacizadatak;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,unitDigit,largestDigit;
		System.out.println("Unesite broj N");
		num = sc.nextInt();
		 largestDigit = -1;
		while(num>0) {
			 unitDigit=num%10;
			if(unitDigit>largestDigit) {
				largestDigit = unitDigit;
				continue;
			}else if(largestDigit<=9)
				break;
			{
				
			}
			num=num/10;
			
		}
		System.out.println("Najveca cifra broja N je:" + largestDigit);	
		

	}

}
