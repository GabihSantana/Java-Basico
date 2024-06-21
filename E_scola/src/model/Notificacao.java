package model;

import java.time.LocalDate;

public class Notificacao {
	private String tituloNotificacao;
	private String descricaoNotificacao;
	private Boolean notificacaoVisualizada;
	private LocalDate dataInicioNotificacao;
	private LocalDate dataFimNotificacao;
	
	public Notificacao(String tituloNotificacao, String descricaoNotificacao, Boolean notificacaoVisualizada,
			LocalDate dataInicioNotificacao, LocalDate dataFimNotificacao) {
		super();
		this.tituloNotificacao = tituloNotificacao;
		this.descricaoNotificacao = descricaoNotificacao;
		this.notificacaoVisualizada = notificacaoVisualizada;
		this.dataInicioNotificacao = dataInicioNotificacao;
		this.dataFimNotificacao = dataFimNotificacao;
	}
	
	public String getTituloNotificacao() {
		return tituloNotificacao;
	}
	public void setTituloNotificacao(String tituloNotificacao) {
		this.tituloNotificacao = tituloNotificacao;
	}
	public String getDescricaoNotificacao() {
		return descricaoNotificacao;
	}
	public void setDescricaoNotificacao(String descricaoNotificacao) {
		this.descricaoNotificacao = descricaoNotificacao;
	}
	public Boolean getNotificacaoVisualizada() {
		return notificacaoVisualizada;
	}
	public void setNotificacaoVisualizada(Boolean notificacaoVisualizada) {
		this.notificacaoVisualizada = notificacaoVisualizada;
	}
	public LocalDate getDataInicioNotificacao() {
		return dataInicioNotificacao;
	}
	public void setDataInicioNotificacao(LocalDate dataInicioNotificacao) {
		this.dataInicioNotificacao = dataInicioNotificacao;
	}
	public LocalDate getDataFimNotificacao() {
		return dataFimNotificacao;
	}
	public void setDataFimNotificacao(LocalDate dataFimNotificacao) {
		this.dataFimNotificacao = dataFimNotificacao;
	}
}
