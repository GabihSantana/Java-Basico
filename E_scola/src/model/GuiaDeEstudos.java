package model;

import java.time.LocalDate;

public class GuiaDeEstudos {
	private String tituloGuiaEstudos;
	private LocalDate dataInicioGuiaEstudos;
	private LocalDate dataFimGuiaEstudos;
	private String ramoGuiaEstudos;
	
	public GuiaDeEstudos(String tituloGuiaEstudos, LocalDate dataInicioGuiaEstudos, LocalDate dataFimGuiaEstudos,
			String ramoGuiaEstudos) {
		super();
		this.tituloGuiaEstudos = tituloGuiaEstudos;
		this.dataInicioGuiaEstudos = dataInicioGuiaEstudos;
		this.dataFimGuiaEstudos = dataFimGuiaEstudos;
		this.ramoGuiaEstudos = ramoGuiaEstudos;
	}
	
	public String getTituloGuiaEstudos() {
		return tituloGuiaEstudos;
	}
	public void setTituloGuiaEstudos(String tituloGuiaEstudos) {
		this.tituloGuiaEstudos = tituloGuiaEstudos;
	}
	public LocalDate getDataInicioGuiaEstudos() {
		return dataInicioGuiaEstudos;
	}
	public void setDataInicioGuiaEstudos(LocalDate dataInicioGuiaEstudos) {
		this.dataInicioGuiaEstudos = dataInicioGuiaEstudos;
	}
	public LocalDate getDataFimGuiaEstudos() {
		return dataFimGuiaEstudos;
	}
	public void setDataFimGuiaEstudos(LocalDate dataFimGuiaEstudos) {
		this.dataFimGuiaEstudos = dataFimGuiaEstudos;
	}
	public String getRamoGuiaEstudos() {
		return ramoGuiaEstudos;
	}
	public void setRamoGuiaEstudos(String ramoGuiaEstudos) {
		this.ramoGuiaEstudos = ramoGuiaEstudos;
	}
}
