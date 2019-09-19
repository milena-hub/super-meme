package domacizadatak;

import java.util.Scanner;

public class CetvrtiZadatak {

	public static void main(String[] args) {
		
		int a,arm=0,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Uneti broj");
		n=sc.nextInt();
		temp=n;
		for( ;n!=0;n/=10 )
		{
			a=n%10;
			arm=arm+(a*a*a);
		}
		if(arm==temp)
		System.out.println(temp+" nije Armstrongov broj ");
		else
		System.out.println(temp+" je Armstrongov broj ");
	        }
	}
