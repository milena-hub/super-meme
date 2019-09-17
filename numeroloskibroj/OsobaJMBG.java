package numeroloskibroj;

public class OsobaJMBG extends Osoba {
	private String JMBG;

	public OsobaJMBG(String ime, String prezime, String adresa, String JMBG) {
		super(ime, prezime, adresa);
		this.JMBG = JMBG;
	}

	public OsobaJMBG(final OsobaJMBG o) {
		this(o.getIme(), o.getPrezime(), o.getAdresa(), o.JMBG);
	}

	public static boolean validan(String JMBG) {
		if (JMBG.length() != 13)
			return false;
		for (int i = 0; i < JMBG.length(); i++)
			if (!Character.isDigit(JMBG.charAt(i)))
				return false;
		// Izdvajamo dan, mesec i godinu da bismo videli da li su validni
		int dan = Integer.parseInt(JMBG.substring(0, 2));
		int mesec = Integer.parseInt(JMBG.substring(2, 4));
		int godina = 1000 + Integer.parseInt(JMBG.substring(4, 7));
		if (!Datum.validan(godina, dan, mesec))
			return false;
		return true;
	}

	public int numeroloskiBroj() {
		int suma = 0;
		for (int i = 0; i < 7; i++) {
			suma += JMBG.charAt(i) - '0';
		}
		suma += 1; /* za ono izostavljeno 1 */
		while (suma > 9)
			suma = zbirCifara(suma);
		return suma;
	}

	public String metabolizam(final Datum d) {
		String datumS = JMBG.substring(0, 4) + "1" + JMBG.substring(4, 7);
		int dI = d.getDan() * 1000000 + d.getMesec() * 10000 + d.getGodina();
		String rez = String.valueOf(Integer.parseInt(datumS) + dI);
		if (rez.length() == 7)
			rez = "0" + rez;
		return rez;
	}

	public String toString() {
		return super.toString() + "; numeroloski broj: " + numeroloskiBroj();
	}
}
