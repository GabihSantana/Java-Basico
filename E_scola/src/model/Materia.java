package model;

public class Materia {
	private String nomeMateria;
	private String siglaMateria;
	private String ementaMateria;
	
	public Materia(String nomeMateria, String siglaMateria, String ementaMateria) {
		super();
		this.nomeMateria = nomeMateria;
		this.siglaMateria = siglaMateria;
		this.ementaMateria = ementaMateria;
	}
	
	public String getNomeMateria() {
		return nomeMateria;
	}
	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	public String getSiglaMateria() {
		return siglaMateria;
	}
	public void setSiglaMateria(String siglaMateria) {
		this.siglaMateria = siglaMateria;
	}
	public String getEmentaMateria() {
		return ementaMateria;
	}
	public void setEmentaMateria(String ementaMateria) {
		this.ementaMateria = ementaMateria;
	}
}
