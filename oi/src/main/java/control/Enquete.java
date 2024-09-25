package control;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Enquete extends ArtefatoInteratividade{
    private String opcoes;

    public Enquete(String tipo, String titulo, String descricao, String opcoes) {
        super(tipo, titulo, descricao);
        this.opcoes = opcoes;
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
            pstm.setNull(6, java.sql.Types.VARCHAR); 
            pstm.setNull(7, java.sql.Types.VARCHAR); 
        } catch (SQLException e) {
            System.err.println("Erro ao preparar a inserção da Enquete: " + e.getMessage());
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
