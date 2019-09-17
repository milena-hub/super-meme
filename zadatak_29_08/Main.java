package zadatak_29_08;

public class Main {

	public static void main(String[] args) {
		Broj b2 = new Broj(2);
		Broj b10 = new Broj(10);
		Broj bn11 = new Broj(-11);
		Broj b20 = new Broj(20);

		Sabiranje s1 = new Sabiranje(b2, b10);
		Oduzimanje o1 = new Oduzimanje(s1, bn11);
		Sabiranje s2 = new Sabiranje(o1, b20);

		System.out.println("Rezultat:" + s1.izracunaj());
		System.out.println("Rezultat:" + o1.izracunaj());
		System.out.println("Rezultat:" + s2.izracunaj());

		Broj b3 = new Broj(2);
		Promenljiva p0 = new Promenljiva("x1", 10);
		Broj bn12 = new Broj(-11);
		Promenljiva p1 = new Promenljiva("x2", 20);

		Sabiranje s3 = new Sabiranje(b2, p0);
		Oduzimanje o2 = new Oduzimanje(s3, bn11);
		Sabiranje s4 = new Sabiranje(o1, p1);

		System.out.println("Rezultat" + s3.toString());
	}

}
