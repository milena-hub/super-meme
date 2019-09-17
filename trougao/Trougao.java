package trougao;

import java.util.Scanner;

public class Trougao extends Tacka {

	private double a;
	private double b;
	private double c;

	public Trougao(double x, double y, double a, double b, double c) {
		super(x, y);
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Vrednost jedne ili vise stranica nije pozitivan broj.");
		} else if (proveraValidnosti(a, b, c) == false) {
			return;
		} else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

	public Trougao(double x, double y) {
		super(x, y);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean proveraJednakokrakosti() {
		if (a == b || b == c || a == c) {
			return true;
		}

		return false;
	}

	public double getObim() {
		return (a + b + c);
	}

	public double getPovrsinu() {
		double s = (a + b + c) / 2;
		double t = s * (s - a) * (s - b) * (s - c);

		double P = Math.sqrt(t);

		return P;

	}

	public static boolean proveraValidnosti(double a, double b, double c) {
		double[] niz = { a, b, c };
		double temp = 0;
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] > niz[i + 1]) {
				temp = niz[i];
				niz[i] = niz[i + 1];
				niz[i + 1] = temp;
			}
		}

		if ((niz[0] + niz[1]) <= niz[2]) {
			System.out.println("Trougao sa stranicama " + niz[0] + ", " + niz[1] + ", " + niz[2] + "nepostoji jer "
					+ niz[0] + "+ " + niz[1] + " nije veci od " + niz[2]);
			return false;
		}
		return true;
	}

	public void promenaStranica() {
		double check;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ako menjate stranicu a unesite 1, b - 2 i c - 3");
		int izbor = sc.nextInt();

		System.out.println("Unesite vrednost stranice.");

		double stranica = sc.nextDouble();

		if (izbor == 1) {
			check = getA();
			setA(stranica);

			if (proveraValidnosti(a, b, c) == false) {
				setA(check);
				System.out.println("Vracena je prethodna vrednost.");

			}
		} else if (izbor == 2) {
			check = getB();
			setB(stranica);
			if (proveraValidnosti(a, b, c) == false) {
				setB(check);
				System.out.println("Vracena je prethodna vrednost.");
			}
		} else if (izbor == 3) {
			check = getC();
			setC(stranica);
			if (proveraValidnosti(a, b, c) == false) {
				setC(check);
				System.out.println("Vracena je prethodna vrednost.");
			}
		} else {
			System.out.println("Niste izabrali validnu stranicu.");
		}

	}

	public boolean poredjenjeTrouglova(Trougao t) {
		if (this.getX() == t.getX() && this.getY() == t.getY()) {
			return true;
		}
		return false;
	}

	public void ispisiTrougao() {
		if (proveraValidnosti(a, b, c)) {
			System.out.println("Trougao sa pocetkom u (x,y): (" + this.getX() + "," + this.getY() + ")");
			System.out.println("Stranice trougla: " + this.getA() + "," + this.getB() + "," + this.getC());
			System.out.println("Povrsina i obim: P = " + getPovrsinu() + ", O = " + getObim());
		} else {
			System.out.println("Trougao nije kreiran pravilno.");
		}
	}

	public void promenaPocetneTacke() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost za koordinate tacke x i y");

		System.out.println("x:");
		setX(sc.nextDouble());
		System.out.println("y:");
		setY(sc.nextDouble());
	}

}
