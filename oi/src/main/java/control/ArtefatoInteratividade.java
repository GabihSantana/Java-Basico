package control;

import com.mysql.jdbc.PreparedStatement;

public abstract class ArtefatoInteratividade {
	private Integer codArtefato;
	private String tipo;
    private String titulo;
    private String descricao;

    public ArtefatoInteratividade(String tipo, String titulo, String descricao) {
		this.tipo = tipo;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodArtefato() {
		return codArtefato;
	}

	public void setCodArtefato(Integer codArtefato) {
		this.codArtefato = codArtefato;
	}
	
    public abstract void prepararInsercao(PreparedStatement pstm);
	public abstract void deletarArtefato();
    public abstract void editarArtefato();
}
