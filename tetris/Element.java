package tetris;

import java.util.Arrays;

public abstract class Element extends Matrica {

	private String polje;
	String[][] matrica;

	/**
	 * @param ispunjen
	 */
	protected Element(String polje) {
		this.polje = polje;
	}
	

	public String[][] getMatrica() {
		return matrica;
	}


	public void setMatrica(String[][] matrica) {
		this.matrica = matrica;
	}


	public abstract String[][] kreirajElement();

	public String getPolje() {
		return polje;
	}
	public void ispisiPaRotiraj() {
		System.out.println(this.toString());
		this.setMatrica(this.rotirajMatricu(this.getMatrica()));
		System.out.println();
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++) {
				if (matrica[i][j] != null)
					sb.append(matrica[i][j] + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
    
}
