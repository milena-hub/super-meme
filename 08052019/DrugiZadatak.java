package domacizadatak;

import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		ucitajNiz(a);
		minMax(a);
		
	}


static void ucitajNiz(int []niz) {
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<niz.length;i++) {
	System.out.println("Unesi element:");
	niz[i]=sc.nextInt();
	}
	}

static void minMax(int []niz) {
	int tmax = niz[0];
    int tmin = niz[0];
    for (int i = 1; i < niz.length; i++) {
        if (tmax < niz[i])
            tmax = niz[i];
        if (tmin > niz[i])
            tmin = niz[i];
    }
    System.out.println("Najveci clan niza je: " + tmax);
    System.out.println("Najmanji clan niza je: " + tmin);
}

}

