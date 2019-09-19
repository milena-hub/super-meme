package petidomaci;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		double cena = 0;
		double racun = 0;
		double kolicina = 0;
		int kupacJeDao = 0;
		int kusur = 0; 
		int zbirKovanica = 0;
		int dinar = 0;
		int dvaDin = 0;
		int petDin = 0;
		int desetDin = 0;
		int dvadesetDin = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite cenu 1. proizvoda: ");
		cena = sc.nextDouble();	
		System.out.println("Unesite kolicinu 1. proizvoda: ");
		kolicina = sc.nextDouble();
		racun += kolicina * cena;
		
		int redniBrojProizvoda = 2;
		do {
		
		System.out.println("Unesite cenu " + redniBrojProizvoda + ". proizvoda ili (-1) ako nema vise proizvoda:");
		cena = sc.nextDouble();
		if (cena > 0) {
		System.out.println("Unesite kolicinu " + redniBrojProizvoda + ". proizvoda:");
		kolicina = sc.nextDouble();
		racun += kolicina * cena;
		}	
		redniBrojProizvoda++;
		} while (cena != -1);

		System.out.println("Ukupna cena proizvoda je: " + Math.round(racun) + "\nKoliko vam je novca dao kupac? ");
		kupacJeDao = sc.nextInt();
		kusur = kupacJeDao - (int)racun;
		System.out.println("Kusur je: " + kusur);
		System.out.println("Da biste vratili najmanji broj kovanica, potrebno je: ");
		
		zbirKovanica = kusur % 100;
		dvadesetDin = zbirKovanica / 20;
		zbirKovanica -= 20 * dvadesetDin;
		desetDin = zbirKovanica/10;
		zbirKovanica -= 10 * desetDin;
		petDin = zbirKovanica / 5;
		zbirKovanica -= 5 * petDin;
		dvaDin = zbirKovanica/10  ;
		zbirKovanica -= 2 * dvaDin;
		dinar = zbirKovanica;
		
		System.out.println(dvadesetDin + " od 20din");
		System.out.println(desetDin + " od 10din");
		System.out.println(petDin + " od 5din");
		System.out.println(dvaDin + " od 2din");
		System.out.println(dinar + " od 1 din");
		sc.close();
		}

		

	}


