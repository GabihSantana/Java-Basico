package model;

import java.time.LocalDate;

public class EncontroSincrono {
	private String assuntoEncontro;
	private String descricaoEncontro;
	private LocalDate dataInicioEncontro;
	private String tagsEncontro;
	private String linkConteudo;
	private String ramoEncontro;
	private Integer recompensa;
	
	public EncontroSincrono(String assuntoEncontro, String descricaoEncontro, LocalDate dataInicioEncontro,
			String tagsEncontro, String linkConteudo, String ramoEncontro, Integer recompensa) {
		super();
		this.assuntoEncontro = assuntoEncontro;
		this.descricaoEncontro = descricaoEncontro;
		this.dataInicioEncontro = dataInicioEncontro;
		this.tagsEncontro = tagsEncontro;
		this.linkConteudo = linkConteudo;
		this.ramoEncontro = ramoEncontro;
		this.recompensa = recompensa;
	}
	
	public String getAssuntoEncontro() {
		return assuntoEncontro;
	}
	public void setAssuntoEncontro(String assuntoEncontro) {
		this.assuntoEncontro = assuntoEncontro;
	}
	public String getDescricaoEncontro() {
		return descricaoEncontro;
	}
	public void setDescricaoEncontro(String descricaoEncontro) {
		this.descricaoEncontro = descricaoEncontro;
	}
	public LocalDate getDataInicioEncontro() {
		return dataInicioEncontro;
	}
	public void setDataInicioEncontro(LocalDate dataInicioEncontro) {
		this.dataInicioEncontro = dataInicioEncontro;
	}
	public String getTagsEncontro() {
		return tagsEncontro;
	}
	public void setTagsEncontro(String tagsEncontro) {
		this.tagsEncontro = tagsEncontro;
	}
	public String getLinkConteudo() {
		return linkConteudo;
	}
	public void setLinkConteudo(String linkConteudo) {
		this.linkConteudo = linkConteudo;
	}
	public String getRamoEncontro() {
		return ramoEncontro;
	}
	public void setRamoEncontro(String ramoEncontro) {
		this.ramoEncontro = ramoEncontro;
	}
	public Integer getRecompensa() {
		return recompensa;
	}
	public void setRecompensa(Integer recompensa) {
		this.recompensa = recompensa;
	}	
}
