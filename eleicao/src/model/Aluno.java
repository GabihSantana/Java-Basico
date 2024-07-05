package model;

import java.time.LocalDate;

public final class Aluno extends Eleitor {
	protected Integer codAluno;
	protected Integer numProntuario;
	protected String curso;
	protected String statusMatricula;
	public Aluno(String nomeEleitor, LocalDate dataCadastro, String tipoEleitor,
			Integer numProntuario, String curso, String statusMatricula) {
		
		super(nomeEleitor, dataCadastro);		
		
		this.codAluno = null;
		this.numProntuario = numProntuario;
		this.curso = curso;
		this.statusMatricula = statusMatricula;
	}
	
		
	public Integer getCodAluno() {
		return codAluno;
	}



	public void setCodAluno(Integer codAluno) {
		this.codAluno = codAluno;
	}



	public Integer getNumProntuario() {
		return numProntuario;
	}



	public void setNumProntuario(Integer numProntuario) {
		this.numProntuario = numProntuario;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public String getStatusMatricula() {
		return statusMatricula;
	}



	public void setStatusMatricula(String statusMatricula) {
		this.statusMatricula = statusMatricula;
	}



	public final boolean validar() {
		// valida se o status da matricula � ativa
	
		super.validar();
		
		if (this.statusMatricula == "Ativa") {
			return true;			
		} else {
			return false;	
		}
				
	}
	
} 


