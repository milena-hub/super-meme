package numeroloskibroj;

public class OsobaD extends Osoba {
	private Datum datum;

	public OsobaD(String ime, String prezime, String adresa, Datum d) {
		super(ime, prezime, adresa);
		datum = new Datum(d);
	}

	public OsobaD(final OsobaD o) {
		super(o.getIme(), o.getPrezime(), o.getAdresa());
		datum = new Datum(o.datum);
	}

	public int numeroloskiBroj() {
		int suma = zbirCifara(datum.getDan()) + zbirCifara(datum.getMesec()) + zbirCifara(datum.getGodina());
		while (suma > 9)
			suma = zbirCifara(suma);
		return suma;
	}

	public String metabolizam(final Datum d) {
		int zbir = (datum.getDan() + d.getDan()) * 1000000 + (datum.getMesec() + d.getMesec()) * 10000
				+ datum.getGodina() + d.getGodina();
		String rez = String.valueOf(zbir);
		if (rez.length() == 7)
			rez = "0" + rez;
		return rez;
	}

	public String toString() {
		return super.toString() + "; numeroloski broj: " + numeroloskiBroj();
	}
}
