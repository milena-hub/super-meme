package domaci_13_08;

public class CetvrtiZadatak {

	public static void main(String[] args) {
		String[] A = { "loptica", "teniserka", "tapiserija" };
        String[] B = zajednickiKarakteri(A);
        ispisiNiz(B);

    }

    public static String[] zajednickiKarakteri(String[] A) {
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "v", "u", "w", "x", "y", "z" };

        String res = "";
        for (int i = 0; i < alphabet.length; i++) {
            boolean contain = true;
            for (int j = 0; j < A.length; j++) {
                if (!A[j].contains(alphabet[i])) {
                    contain = false;
                }
            }
            if (contain == true) {
                res += alphabet[i];
            }
        }
        String[] finalRes = new String[res.length()];
        for (int i = 0; i < finalRes.length; i++) {
            finalRes[i] = String.valueOf(res.charAt(i));
        }
        return finalRes;
    }

    public static void ispisiNiz(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
    }



	




	}


