package domacizadatak;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,x,y,z,s;
		System.out.println("Unesite trocifren broj:");
        a = sc.nextInt();
        x=a/100;
        y=(a/10)%10;
        z=a%10;
        s=x+y+z;
        System.out.println("Zbir cifara unetog trocifrenog broja je: " + s);
	}

}
