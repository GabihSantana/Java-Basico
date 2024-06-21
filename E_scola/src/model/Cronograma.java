package model;

import java.time.LocalDate;

public class Cronograma {
	private String nomeCronograma;
	private LocalDate dataInicioCronograma;
	private LocalDate dataFimCronograma;
	
	public Cronograma(String nomeCronograma, LocalDate dataInicioCronograma, LocalDate dataFimCronograma) {
		super();
		this.nomeCronograma = nomeCronograma;
		this.dataInicioCronograma = dataInicioCronograma;
		this.dataFimCronograma = dataFimCronograma;
	}
	
	public String getNomeCronograma() {
		return nomeCronograma;
	}
	public void setNomeCronograma(String nomeCronograma) {
		this.nomeCronograma = nomeCronograma;
	}
	public LocalDate getDataInicioCronograma() {
		return dataInicioCronograma;
	}
	public void setDataInicioCronograma(LocalDate dataInicioCronograma) {
		this.dataInicioCronograma = dataInicioCronograma;
	}
	public LocalDate getDataFimCronograma() {
		return dataFimCronograma;
	}
	public void setDataFimCronograma(LocalDate dataFimCronograma) {
		this.dataFimCronograma = dataFimCronograma;
	}
}
