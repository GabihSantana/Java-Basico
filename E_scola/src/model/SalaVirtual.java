package model;

public class SalaVirtual {
	private String nomeSala;
	private String descricaoSala;
	private String miniaturaSala;
	private String codigoSala;
	private Integer volumetriaEstudantes;
	
	public SalaVirtual(String nomeSala, String descricaoSala, String miniaturaSala, String codigoSala,
			Integer volumetriaEstudantes) {
		super();
		this.nomeSala = nomeSala;
		this.descricaoSala = descricaoSala;
		this.miniaturaSala = miniaturaSala;
		this.codigoSala = codigoSala;
		this.volumetriaEstudantes = volumetriaEstudantes;
	}
	
	public String getNomeSala() {
		return nomeSala;
	}
	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}
	public String getDescricaoSala() {
		return descricaoSala;
	}
	public void setDescricaoSala(String descricaoSala) {
		this.descricaoSala = descricaoSala;
	}
	public String getMiniaturaSala() {
		return miniaturaSala;
	}
	public void setMiniaturaSala(String miniaturaSala) {
		this.miniaturaSala = miniaturaSala;
	}
	public String getCodigoSala() {
		return codigoSala;
	}
	public void setCodigoSala(String codigoSala) {
		this.codigoSala = codigoSala;
	}
	public Integer getVolumetriaEstudantes() {
		return volumetriaEstudantes;
	}
	public void setVolumetriaEstudantes(Integer volumetriaEstudantes) {
		this.volumetriaEstudantes = volumetriaEstudantes;
	}
}
