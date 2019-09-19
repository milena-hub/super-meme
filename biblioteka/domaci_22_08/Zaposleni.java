package domaci_22_08;

import java.time.LocalDate;

public class Zaposleni extends Covek {
	private int godinaZaposlenja;
	private int plata;
	public Zaposleni(String imePrezime, LocalDate datumRodjenja, int godinaZaposlenja, int plata) {
		super(imePrezime, datumRodjenja);
		this.godinaZaposlenja = godinaZaposlenja;
		this.plata = plata;
	}
	public int getGodinaZaposlenja() {
		return godinaZaposlenja;
	}
	public void setGodinaZaposlenja(int godinaZaposlenja) {
		this.godinaZaposlenja = godinaZaposlenja;
	}
	public int getPlata() {
		return plata;
	}
	public void setPlata(int plata) {
		this.plata = plata;
	}
	@Override
	public String toString() {
		return super.toString() + "Zaposleni od" + godinaZaposlenja + ". godine, plata je" + plata + ".";
	}

	
	
	
}
