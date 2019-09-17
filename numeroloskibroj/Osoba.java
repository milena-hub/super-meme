package numeroloskibroj;

public abstract class Osoba {
	private String ime;
	private String prezime;
	private String adresa;

	public Osoba(String ime, String prezime, String adresa) {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
	}

	// metodi koji ce se polimorfno pozivati
	public abstract int numeroloskiBroj();

	public abstract String metabolizam(final Datum d);

	int zbirCifara(int broj) {
		int suma = 0;
		do {
			suma += broj % 10;
			broj /= 10;
		} while (broj != 0);
		return suma;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public String toString() {
		return prezime + " " + ime + ", " + adresa;
	}
}
