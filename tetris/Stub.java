package tetris;

public class Stub extends Element {
	

	public Stub(String polje) {
		super(polje);
		this.matrica = new String[0][4];
	}

	@Override
	public String[][] kreirajElement() {
		String polje = this.getPolje();
		return this.matrica = new String[][] { {polje, polje,polje, polje},};

}
}