package aproksimatoralkohola;

import java.util.Scanner;

public class AproksimatorAlkohola {
	static Scanner sc = new Scanner(System.in);
	static int tezina = 0;
	static int pol = 0;
	static int id = 0;
	static int mlRakija = 0;
	static int mlVinjak = 0;
	static int mlPivo = 0;
	static int mlVino = 0;
	static String kazna = "";
	static String stanje = "";
	static int kazneniPoeni = 0;
	static int zabrana = 0;
	static double bac = 0;
	
	public static void main(String[] args) {		
		
		System.out.println("Dobrodosli u alko aproksimator 9000");
		System.out.println("Unesite vasu tezinu (kg): ");
		tezina = sc.nextInt();
		System.out.println("Unesite vas pol(ako ste musko unesite 1,ako ste zensko unesite 0): ");
		pol = sc.nextInt();
		unosPopijenogPica();
		System.out.println("r = " + r());
		bac = izracunajBAC();
		ishod();
		System.out.println("------------------------------------------------------------------------");
		System.out.println("BAC: " + bac + " - " + stanje);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Kazna: " + kazna);
		System.out.println("Kazneni poeni: " + kazneniPoeni);
		System.out.println("Zabrana voznje: " + zabrana);
	}
	
	static void unosPopijenogPica() {
		id = 0;
		int mililitri = 0;
		do {
			//int mililitri = 0;
			System.out.println("Unesite id pica koje ste pili ili -1 ako ste uneli sva pica koja ste pili: ");
			System.out.println("Rakija (1)");
			System.out.println("Vinjak (2)");
			System.out.println("Pivo (3)");
			System.out.println("Vino (4)");
			id = sc.nextInt();	
			if (id == -1)
				break;
			System.out.println("Unesite koliko mililitara(ml)tog pica ste popili: ");
			mililitri = sc.nextInt();
			switch (id) {
			case (1):
				mlRakija = mililitri;
				break;
			case (2):
				mlVinjak = mililitri;
				break;
			case (3):
				mlPivo = mililitri;
				break;
			case (4):
				mlVino = mililitri;
				break;			
			default:
				System.out.println("Pogresan unos!");
			}			
			
		} while (id != -1);
	}
	
	static double r() {
		double r = 0;
		switch (pol) {
		case (0): 
			r = 0.68;
			break;
		case (1): 
			r = 0.55;
			break;
		}
		return r;
	}
	
	static double izracunajBAC() {
		return ((mlRakija * 50 + mlVinjak * 40 + mlPivo * 4.7 + mlVino * 11)/(tezina*1000*r()))*10;			
	}
	
	static void ishod() {
		if (bac > 0 && bac <= 0.2) {
			kazna = "Nema kazne";
			kazneniPoeni = 0;
			zabrana = 0;
			stanje = "Dozvoljena alkoholisanost";
		} else if (bac > 0.2 && bac <= 0.5) {
			kazna = "10.000";
			kazneniPoeni = 0;
			zabrana = 0;
			stanje = "Umerena alkoholisanost";
		} else if (bac > 0.5 && bac <= 0.8) {
			kazna = "10.000 - 20.000";
			kazneniPoeni = 6;
			zabrana = 3;
			stanje = "Srednja alkoholisanost";
		} else if (bac > 0.8 && bac <= 1.2) {
			kazna = "20.000 - 40.000";
			kazneniPoeni = 8;
			zabrana = 4;
			stanje = "Visoka alkoholisanost";
		} else if (bac > 1.2 && bac <= 1.6) {
			kazna = "100.000 - 120.000";
			kazneniPoeni = 9;
			zabrana = 8;
			stanje = "Teska alkoholisanost";
		} else if (bac > 1.6 && bac <= 2.0) {
			kazna = "120.000 - 140.000";
			kazneniPoeni = 14;
			zabrana = 8;
			stanje = "Mortus pijan";
		} else if (bac > 2.0) {
			kazna = "30 - 60 dana zatvora";
			kazneniPoeni = 15;
			zabrana = 9;
			stanje = "Potpuna alkoholisanost";
		} else {
			System.out.println("Unos alkohola ne moze biti negativan.");
		}
	}

}
