package cetvrtak_15_08;

public class Main {

	public static void main(String[] args) {
		Pravougaonik p1 = new Pravougaonik(5, 4, "Prvi");
		Pravougaonik p2 = new Pravougaonik(8, "Drugi");

		System.out.println("Stranica a prvog pravougaonika je " + p1.getA() + ", a drugog je " + p2.getA());
		System.out.println("Stranica b prvog pravougaonika je " + p1.getB() + ", a drugog je " + p2.getB());
		System.out.println();
		p1.ispisiPravougaonik();
		System.out.println();
		p2.ispisiPravougaonik();

	}

}
