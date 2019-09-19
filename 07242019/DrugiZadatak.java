package domacizadatak;

import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi godinu");
		int godina = sc.nextInt();
        if(godina % 4 == 0 && godina % 100 != 0 || (godina % 400== 0)) {
        System.out.println("Godina jeste prestupna");
	}else {
		System.out.println("Godina nije prestupna");
	}

}
}
