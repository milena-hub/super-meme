package prodavnicaalbuma;

public class Prodavnica {
	private String ime;
	private String lokacija;
	private Artikal[] inventar;
	private int brojac;
	
	protected Prodavnica(String ime, String lokacija) {
		super();
		this.ime = ime;
		this.lokacija = lokacija;
		this.inventar = new Artikal[10];
		brojac = 0;
	}

	public Artikal[] pretrazi(String tekst) {
		Artikal[] rezultat;
		Artikal[] temp = new Artikal[inventar.length];
		int brojacRez = 0;

		String text = tekst.toLowerCase();

		for (int i = 0; i < brojac; i++) {
			if (inventar[i].ime().toLowerCase().contains(text)) {
				temp[brojacRez] = inventar[i];
				brojacRez++;
			}
		}

		if (brojacRez > 0) {
			rezultat = new Artikal[brojacRez - 1];
			for (int i = 0; i < brojacRez - 1; i++) {
				rezultat[i] = temp[i];
			}

		} else {
			rezultat = new Artikal[0];
		}

		return rezultat;

	}

	public void dodaj(Artikal artikal) {
		brojac++;

		if (brojac == inventar.length) {
			Artikal[] temp = inventar;
			inventar = new Artikal[2 * brojac];
			for (int i = 0; i < brojac; i++) {
				inventar[i] = temp[i];
			}
		}

		inventar[brojac - 1] = artikal;

	}

	public String getIme() {
		return ime;
	}

	public String getLokacija() {
		return lokacija;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getIme() + ": " + lokacija);
		for (int i = 0; i < brojac; i++) {
			sb.append("\n\t" + inventar[i].toString());
		}

		return sb.toString();
	}

}


