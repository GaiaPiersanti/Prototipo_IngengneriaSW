package dati;

public class Mostra extends Contenuto {
	public Mostra(String id, String nome, String idCuratore) {
		super(id, nome);
		this.idCuratore = idCuratore;
	}

	private String idCuratore;

	public String getIdCuratore() {
		return idCuratore;
	}

	public void setIdCuratore(String idCuratore) {
		this.idCuratore = idCuratore;
	}

}
