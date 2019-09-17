package tetris;

public class DesnoZ extends Element {
	

	public DesnoZ(String polje) {
		super(polje);
		this.matrica = new String[2][3];
	}

	@Override
	public String[][] kreirajElement() {
		String polje = this.getPolje();
		return this.matrica = new String[][] { {polje, polje, " "}, {" ", polje, polje},};
}

}
