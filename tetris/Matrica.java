package tetris;

public class Matrica {

	

	public String[][] rotirajMatricu(String[][] matrica) {
		String rotirajMatricu[][] = new String[matrica[0].length][matrica.length];
		for (int i = 0; i < (rotirajMatricu.length); i++) {
			for (int j = 0; j < (rotirajMatricu[0].length); j++) {
				rotirajMatricu[i][rotirajMatricu[0].length - j - 1] = matrica[j][i];
			}
		}
		return rotirajMatricu;
	}

	
	}
    

