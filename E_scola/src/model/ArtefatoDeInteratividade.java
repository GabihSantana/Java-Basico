package model;

public class ArtefatoDeInteratividade {
	private String tipoArtefato;
	private String tituloArtefato;
	private String descricoArtefato;
	private SalaVirtual salaVirtual;
	
	public ArtefatoDeInteratividade(String tipoArtefato, String tituloArtefato, String descricoArtefato,
			SalaVirtual salaVirtual) {
		super();
		this.tipoArtefato = tipoArtefato;
		this.tituloArtefato = tituloArtefato;
		this.descricoArtefato = descricoArtefato;
		this.salaVirtual = salaVirtual;
	}
	
	public String getTipoArtefato() {
		return tipoArtefato;
	}
	public void setTipoArtefato(String tipoArtefato) {
		this.tipoArtefato = tipoArtefato;
	}
	public String getTituloArtefato() {
		return tituloArtefato;
	}
	public void setTituloArtefato(String tituloArtefato) {
		this.tituloArtefato = tituloArtefato;
	}
	public String getDescricoArtefato() {
		return descricoArtefato;
	}
	public void setDescricoArtefato(String descricoArtefato) {
		this.descricoArtefato = descricoArtefato;
	}
}
