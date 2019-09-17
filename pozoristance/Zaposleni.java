package pozoristance;

public abstract class Zaposleni {
	
	private String ime;
	private Pozoriste pozoriste;
	public Zaposleni(String ime, Pozoriste pozoriste) {
		super();
		this.ime = ime;
		this.pozoriste = pozoriste;
	}
	public String getIme() {
		return ime;
	}
	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	
	
	public abstract String imePosla();
	public char getPrvoSlovo() {
		return this.getClass().getName().charAt(0);
	}
	
	@Override
	public String toString() {
		return ime + "(" + imePosla() + ", "+ pozoriste.getSkraceniNaziv() + ")";  
	}
	
	

}
