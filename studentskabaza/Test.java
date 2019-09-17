package studentskabaza;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		StudentskaBaza db = new StudentskaBaza("jdbc:sqlite:C:\\Users\\PavleOman\\Downloads\\studentskabaza.db");
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate upis = LocalDate.of(2017, 7, 23);
		LocalDate rodjendan = LocalDate.of(1977, 05, 13);
		db.connect();

		db.dodajStudenta("20140035", "Marina", "Radosavljevic", upis, rodjendan, "Beograd");
		db.ispisiStudente();
		System.out.println("\n\n");
		db.ispisiPredmete();
		System.out.println("\n\n");
		db.ispisiStudenteBeograda();
		System.out.println("\n\n");
		db.mestaRodjenja();
		System.out.println("\n\n");
		db.NaziviPredmetaPrekoSestBodova();
		System.out.println("\n\n");
		db.ispisiPredmeteIzmedju();
		System.out.println("\n\n");
		db.triIspita();
		System.out.println("\n\n");
		db.triIspita1();
		System.out.println("\n\n");
		db.ispisiPredmeteIcene();
		db.izbrisiIspiteSaNevalidnimOcenama();
		System.out.println("\n\n");
		LocalDate date = LocalDate.of(1999, 5, 25);
		db.setDatumRodjenja(20130027, date);
	}

}
