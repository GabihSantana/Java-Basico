package model;

import java.time.LocalDate;

public class Urna {
	
	private Integer codUrna;
	private LocalDate dataAbertura;
	private LocalDate dataFechamento;
	private String modeloUrna;
	private String statusUrna;
	
	
	public Urna(Integer codUrna) {
		this.codUrna = codUrna;
		this.dataAbertura = null;
		this.dataFechamento = null;
		this.modeloUrna = null;
		this.statusUrna = null;
		
	}

	public Urna(Integer codUrna, LocalDate dataAbertura) {
		this.codUrna = codUrna;
		this.dataAbertura = dataAbertura;
	}

	public Integer getCodUrna() {
		return codUrna;
	}

	public void setCodUrna(Integer codUrna) {
		this.codUrna = codUrna;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public String getModeloUrna() {
		return modeloUrna;
	}

	public void setModeloUrna(String modeloUrna) {
		this.modeloUrna = modeloUrna;
	}

	public String getStatusUrna() {
		return statusUrna;
	}

	public void setStatusUrna(String statusUrna) {
		this.statusUrna = statusUrna;
	}
	
	public Boolean abrirUrna(LocalDate data) {
		this.setDataAbertura(data);
		this.setStatusUrna("A");
		return true;
	}

	public Boolean fecharUrna(LocalDate data) {
		this.setDataFechamento(data);
		this.setStatusUrna("F");
		return true;
	}
	
}
