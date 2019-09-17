package domaci_13_08;

import java.util.Arrays;

public class TreciZadatak {

	public static void main(String[] args) {
		int niz[]  = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        int rezultat[];
        System.out.println("Pocetni niz ");
        System.out.println(Arrays.toString(niz));

        rezultat = sortirajPoParnosti(niz);
 
        System.out.print("Niz posle odvajanja ");
        System.out.println(Arrays.toString(rezultat));
    }
	
    static int [] sortirajPoParnosti(int niz[])
    {
        int leva_strana = 0, desna_strana = niz.length - 1;
        while (leva_strana < desna_strana )
        {
            while (niz[leva_strana]%2 == 0 && leva_strana <desna_strana)
            	leva_strana++;
 
            while (niz[desna_strana]%2 == 1 && leva_strana < desna_strana)
                desna_strana--;
 
            if (leva_strana < desna_strana)
            {
                int temp = niz[leva_strana];
               niz[leva_strana] = niz[desna_strana];
                niz[desna_strana] = temp;
               leva_strana++;
                desna_strana--;
            }
        }
        return niz;
    }


	}


