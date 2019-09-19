package prodavnicaalbuma;

public class LP extends AlbumArtikal {
	
	protected LP(Album album, String izdavac, double cena, int kolicina, int tezina) {
		super(cena, kolicina, izdavac, album);
		this.tezina = tezina;
	}

	@Override
	public boolean kupi() {
		if (super.getKolicina() > 0) {
			super.setKolicina(super.getKolicina() - 1);
			return true;
		}
		return false;

	}

	private int tezina;

	@Override
	public String ime() {
		String str = super.getAlbum().getIzvodjac() + " - " + super.getAlbum().getNaziv() + " (" + this.tezina
				+ "[g]LP)";
		return str;
	}

}



