package cetvrtak_15_08;

public class Pravougaonik {

	private double a;
	private double b;
	private String ime;

	public Pravougaonik(double a, double b, String ime) {
		this.a = a;
		this.b = b;
		this.ime = ime;
	}

	public Pravougaonik(double a, String ime) {
		this.a = a;
		this.b = a;
		this.ime = ime;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public String getIme() {
		return ime;
	}

	public double getObim() {
		return 2 * (a + b);
	}

	public double getPovrsina() {
		return a * b;
	}

	public void ispisiPravougaonik() {
		System.out.println("Ime je " + ime);
		System.out.println("Stranica a je " + getA());
		System.out.println("Stranica b je " + getB());
		System.out.println("Obim je " + getObim());
		System.out.println("Povrsina je " + getPovrsina());
	}

}
