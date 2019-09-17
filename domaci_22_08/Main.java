package domaci_22_08;


import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		StudentOsnovnihStudija stOs = new StudentOsnovnihStudija("Pera Peric", LocalDate.of(1999, 3, 30), 3, 8.9, "Neki smer");
	    Sluzbenik sluzbenik1 = new Sluzbenik("Sima Simic", LocalDate.of(1967, 5,22), 1990, 60000, "pravni");
	    Sluzbenik sluzbenik2 = new Sluzbenik("Pavle Pavlovic", LocalDate.of(1968, 3,22), 1990, 60000, "administrativni");
	     
		System.out.println(stOs);
		System.out.println(sluzbenik1);
		System.out.println(sluzbenik2);

}
}