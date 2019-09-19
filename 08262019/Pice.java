package ponedeljak_26_08;

public class Pice extends Namirnica{
	
	private double kolicina;
	private double enVr;
	private int id;
	public Pice(String ime, double kolicina, double enVr) {
		super(ime);
		this.kolicina = kolicina;
		this.enVr = enVr;
		this.id=super.getId();
	}
	public double getKolicina() {
		return kolicina;
	}
	public double getEnVr() {
		return enVr;
	}
	@Override
	public double energVr() {
		double ukupnaEnVr = kolicina*enVr;
		return ukupnaEnVr;
	}
	@Override
	public String toString() {
		return "[" + this.id +"]" + super.getIme() +   "( " +  kolicina + "litara," + energVr() + "kJ)";
	}

	
}
