package tetris;

public class Kvadrat extends Element {
	

	public Kvadrat(String polje) {
		super(polje);
		this.matrica = new String[2][2];
	}

	@Override
	public String[][] kreirajElement() {
		String polje = this.getPolje();
		return this.matrica = new String[][] { {polje, polje}, {polje, polje},};
}

}
