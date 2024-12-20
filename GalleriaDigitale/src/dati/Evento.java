package dati;

import java.util.Date;

public class Evento extends Contenuto {
	public Evento(String id,String nome,Date dataEvento, String idCuratore, String categoria) {
		super(id, nome);
		this.dataEvento = dataEvento;
		this.idCuratore = idCuratore;
		this.categoria = categoria;
	}
	private Date dataEvento;
	private String idCuratore;
	private String categoria;
	
	
	public Date getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getIdCuratore() {
		return idCuratore;
	}
	public void setIdCuratore(String idCuratore) {
		this.idCuratore = idCuratore;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
