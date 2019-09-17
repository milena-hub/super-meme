package tetris;

public class SlovoT extends Element {
	

	public SlovoT(String polje) {
		super(polje);
		this.matrica = new String[2][3];
	}

	@Override
	public String[][] kreirajElement() {
		String polje = this.getPolje();
		return this.matrica = new String[][] { {" ", polje, " "}, {polje, polje, polje},};
}

}
