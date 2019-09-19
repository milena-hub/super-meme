package prodavnicaalbuma;

import java.time.LocalDate;

public class Album {
	private String naziv;
	private String izvodjac;
	private LocalDate datum;
	private Numera[] listaNumera;
	private int brojac;
	
	protected Album(String naziv, String izvodjac, LocalDate datum) {
		super();
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		this.brojac = 0;
	}

	public void dodaj(Numera numera) {
		if (brojac % 10 == 0) {
			Numera[] temp = new Numera[brojac];
			listaNumera = new Numera[brojac + 10];
			for (int i = 0; i < brojac; i++) {
				listaNumera[i] = temp[i];
			}
		}
		
		brojac++;
		listaNumera[brojac - 1] = numera;

		return;

	}

	public void dodaj(String name, String trajanje) {

		Numera numera = new Numera(name, this.getIzvodjac(), trajanje);
		dodaj(numera);
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}

	public void setIzvodjac(String izvodjac) {
		this.izvodjac = izvodjac;
	}

	public String getTrajanje() {
		int minuti = 0;
		int sekunde = 0;
		String[] minSec = new String[2];
		String ukupnoTrajanje = "";

		for (int i = 0; i < brojac; i++) {

			minSec = listaNumera[i].getTrajanje().split(":");

			minuti += Integer.parseInt(minSec[0]);
			sekunde += Integer.parseInt(minSec[1]);
		}
		minuti += sekunde / 60;
		sekunde = sekunde % 60;

		ukupnoTrajanje = String.valueOf(minuti) + ":" + String.valueOf(sekunde);
		return ukupnoTrajanje;
	}

	public Numera getNumera(int index) {
		return listaNumera[index];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getIzvodjac() + ": " + getNaziv() + ", " + datum);
		for (int i = 0; i < brojac; i++) {
			sb.append("\n\t" + listaNumera[i].toString());
		}

		return sb.toString();
	}

}


