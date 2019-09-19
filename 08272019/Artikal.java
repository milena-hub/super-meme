package prodavnicaalbuma;

public abstract class Artikal {
	private static int globalID = 0;
	private double cena;
	private int kolicina;
	private int id;
	
	protected Artikal(double cena, int kolicina) {

		this.cena = cena;
		this.kolicina = kolicina;
		id=globalID;
		globalID++;
	}

	public boolean kupi() {
		return false;
	}

	public abstract String ime();

	public  int getId() {
		return id;
	}

	public double getCena() {
		return cena;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return "#" + id + " " + ime() + " - " + getCena() + "[kol: " + getKolicina() + "]";
	}

}


