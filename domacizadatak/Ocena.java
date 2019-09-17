package domacizadatak;

public class Ocena {
	private int bodovi;
	private Predmet pr;

	public Ocena(int bodovi, Predmet pr) {
		super();
		this.bodovi = bodovi;
		this.pr = pr;
	}

	public int getBodovi() {
		return bodovi;
	}

	public void setBodovi(int bodovi) {
		this.bodovi = bodovi;
	}

	public Predmet getPr() {
		return pr;
	}

	public void setPr(Predmet pr) {
		this.pr = pr;
	}

	public int getOcena() {
		int ocena = 0;
		if (this.getBodovi() < 50)
			ocena = 5;
		else if (this.getBodovi() < 60)
			ocena = 6;
		else if (this.getBodovi() < 70)
			ocena = 7;
		else if (this.getBodovi() < 80)
			ocena = 8;
		else if (this.getBodovi() < 90)
			ocena = 9;
		else
			ocena = 10;

		return ocena;
	}

	@Override
	public String toString() {
		return "Predmet:" + this.getPr().getIme() + ", Ocena:" + this.getOcena();
	}

}
