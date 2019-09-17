package trougao;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Tacka[] nizTacaka = new Tacka[10];
		Random r = new Random();

		for (int i = 0; i < nizTacaka.length; i++) {
			double x = (double) r.nextInt(100);
			double y = (double) r.nextInt(100);
			nizTacaka[i] = new Tacka(x, y);
		}

		Trougao t1 = new Trougao(nizTacaka[0].getX(), nizTacaka[0].getY(), 10, 7, 15);
		Trougao t2 = new Trougao(nizTacaka[2].getX(), nizTacaka[2].getY(), 15, 4, 12);
		Trougao t3 = new Trougao(nizTacaka[5].getX(), nizTacaka[5].getY(), 2, 2, 3);

		System.out.println("----------------------");

		t3.ispisiTrougao();

		System.out.println("----------------------");

		System.out.println(t3.getObim());
		System.out.println(t3.getPovrsinu());

		System.out.println("----------------------");

		if (t2.proveraJednakokrakosti()) {
			System.out.println("Trougao je jednakokrak.");
		} else {
			System.out.println("Trougao nije jednakokrak.");
		}

		System.out.println("----------------------");

		t1.promenaStranica();

		System.out.println("----------------------");

		Trougao t4 = new Trougao(nizTacaka[0].getX(), nizTacaka[0].getY(), 5, 6, 8);

		if (t1.poredjenjeTrouglova(t4)) {
			System.out.println("Trouglovi imaju istu pocetnu tacku.");
		} else {
			System.out.println("Trouglovi nemaju istu pocetnu tacku.");
		}
	}


	}


