package biblioteka;

public class Main {

	public static void main(String[] args) {
		Polica polica = new Polica();

		Knjiga knjiga1 = new Knjiga("Naziv knjige 1");

		ListPapira list1 = new ListPapira(3, "Ovo je tekst lista 3");
		ListPapira list2 = new ListPapira(5, "Ovo je tekst lista 5");
		ListPapira list3 = new ListPapira(12, "Ovo je tekst lista 12");
		ListPapira list4 = new ListPapira(26, "Ovo je tekst lista 26");
		ListPapira list5 = new ListPapira(1, "Ovo je tekst lista 1");

		Knjiga knjiga2 = new Knjiga("Naziv knjige 2");

		ListPapira list12 = new ListPapira(23, "Ovo je tekst lista 23");
		ListPapira list22 = new ListPapira(25, "Ovo je tekst lista 25");
		ListPapira list32 = new ListPapira(212, "Ovo je tekst lista 212");
		ListPapira list42 = new ListPapira(226, "Ovo je tekst lista 226");
		ListPapira list52 = new ListPapira(21, "Ovo je tekst lista 21");

		knjiga1.dodajList(list1);
		knjiga1.dodajList(list2);
		knjiga1.dodajList(list3);
		knjiga1.dodajList(list4);
		knjiga1.dodajList(list5);

		knjiga2.dodajList(list12);
		knjiga2.dodajList(list22);
		knjiga2.dodajList(list32);
		knjiga2.dodajList(list42);
		knjiga2.dodajList(list52);


		polica.staviKnjigu(knjiga1);
		polica.staviKnjigu(knjiga2);

		System.out.println(polica.toString());

			}

}
