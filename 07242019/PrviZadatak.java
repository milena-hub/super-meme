package domacizadatak;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dan");
		int dan = sc.nextInt();
		switch (dan) {
        case 1:
            System.out.println("Ponedeljak, do vikenda je ostalo cak 5 dana:(");
            break;
        case 2:
            System.out.println("Utorak, do vikenda jos 4 dana");
            break;
        case 3:
            System.out.println("Sreda, do vikenda je ostalo jos samo 3 dana");
            break;
        case 4:
            System.out.println("Cetvrtak, do vikenda je ostalo jos samo 2 dana");
            break;
        case 5:
            System.out.println("Petak, samo jos jedan dan:)");
            break;
        case 6:
            System.out.println("Subota");
            break;
        case 7:
            System.out.println("Nedelja!!!!");
            break;
        default:
            System.out.println("Unijeli ste pogresnu ocjenu. ");
            break;
		
		
		

	}

}
}
