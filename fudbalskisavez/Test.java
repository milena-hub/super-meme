package fudbalskisavez;

public class Test {

	public static void main(String[] args) {
		FudbalskiSavez db = new FudbalskiSavez("jdbc:sqlite:C:\\Users\\PavleOman\\Downloads\\FudbalskiSavez.db");
		db.connect();
		db.fudbaleriITimovi();
		System.out.println("\n\n");
		db.fudbaleriManchestera();
		System.out.println("\n\n");
		db.fudbaleriIGolovi();
		System.out.println("\n\n");
		db.najviseGolova();
		System.out.println("\n\n");
		db.zutiICrveniKartoni();
		System.out.println("\n\n");
		db.mestaIgranja();
		//db.dodajFudbalera("Eric Cantona", "Manchester United");
		//db.dodajTim("Newcastle", "Newcastle");
		//db.dodajUtakmicu("Arsenal", "Newcastle", "5", "X", 2009);
		//db.obrisiTim("Barselona");
	}

}
