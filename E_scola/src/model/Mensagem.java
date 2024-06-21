package model;

import java.time.LocalDate;

public class Mensagem {
	private String texto;
	private String arquivo;
	private LocalDate dataHora;
	private String remetente;
	
	public Mensagem(String texto, String arquivo, LocalDate dataHora, String remetente) {
		super();
		this.texto = texto;
		this.arquivo = arquivo;
		this.dataHora = dataHora;
		this.remetente = remetente;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public LocalDate getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDate dataHora) {
		this.dataHora = dataHora;
	}
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
}
