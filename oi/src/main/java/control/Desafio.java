package control;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Desafio extends ArtefatoInteratividade{
	private String requisitos;
	private String opcoes;

    public Desafio(String tipo, String titulo, String descricao, String requisitos, String opcoes) {
        super(tipo, titulo, descricao);
        this.requisitos = requisitos;
        this.opcoes = opcoes;
    }

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	
	public String getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(String opcoes) {
		this.opcoes = opcoes;
	}
	
	
	@Override
    public void prepararInsercao(PreparedStatement pstm) {
        try {
            pstm.setString(4, opcoes);
            pstm.setNull(5, java.sql.Types.VARCHAR); 
            pstm.setString(6, requisitos); 
            pstm.setNull(7, java.sql.Types.VARCHAR); 
        } catch (SQLException e) {
            System.err.println("Erro ao preparar a inserção do Desafio: " + e.getMessage());
            e.printStackTrace();
        }
    }

	@Override
	public void deletarArtefato() {
        //TODO: Função responsável por deletar artefato;
	}

	@Override
	public void editarArtefato() {
        //TODO: Função responsável por editar artefato;
	}

}
