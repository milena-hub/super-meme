package tetris;

public class LevoZ extends Element {
	

	public LevoZ(String polje) {
		super(polje);
		this.matrica = new String[2][3];
	}

	@Override
	public String[][] kreirajElement() {
		String polje = this.getPolje();
		return this.matrica = new String[][] { {" ", polje, polje}, {polje, polje, " "}};
}
}