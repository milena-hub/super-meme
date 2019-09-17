package numeroloskibroj;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj osoba: ");
		int n = sc.nextInt();
		Osoba osobe[] = new Osoba[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite ime " + (i + 1) + ". osobe:");
			String ime = sc.next();
			System.out.println("Unesite prezime osobe: ");
			String prezime = sc.next();
			System.out.println("Unesite adresu osobe: ");
			String adresa = sc.next();
			System.out.println("Ako znate datum rodjenja osobe," + "unesite 1,\n a ako znate JMBG unesite 2");
			int izbor = sc.nextInt();
			switch (izbor) {
			case 1:
				System.out.println("Unesite datum u obliku dd.mm.gggg.");
				String datumS = sc.next();
				Datum datum = Datum.string2datum(datumS);
				if (datum == null) {
					i--;
					break;
				}
				osobe[i] = new OsobaD(ime, prezime, adresa, datum);
				break;
			case 2:
				System.out.println("Unesite JMBG:");
				String JMBG = sc.next();
				if (OsobaJMBG.validan(JMBG)) {
					osobe[i] = new OsobaJMBG(ime, prezime, adresa, JMBG);
					break;
				}
				System.out.println("Nije validan JMBG");
				i--;
				break;
			default:
				System.out.println("Pogresna opcija");
				i--;
				break;
			}
		}
		Datum datumDanasnji = null;
		while (datumDanasnji == null) {
			System.out.println("Unesite danasnji datum u formatu dd.mm.gggg.");
			String datumDanasnjiS = sc.next();
			datumDanasnji = Datum.string2datum(datumDanasnjiS);
		}
		System.out.println("Rezultati: ");
		for (int i = 0; i < n; i++)
			if (osobe[i].numeroloskiBroj() != 7 && osobe[i].metabolizam(datumDanasnji).indexOf("0") == -1)
				System.out.println(osobe[i] + ", metabolizam: " + osobe[i].metabolizam(datumDanasnji));
	}

}
