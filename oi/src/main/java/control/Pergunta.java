package control;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Pergunta extends ArtefatoInteratividade{
    private String opcoes;
    private String resposta;

    public Pergunta(String tipo, String titulo, String descricao, String opcoes, String resposta) {
        super(tipo, titulo, descricao);
        this.opcoes = opcoes;
        this.resposta = resposta;
    }

    public String getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String opcoes) {
        this.opcoes = opcoes;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public void prepararInsercao(PreparedStatement pstm) {
        try {
            pstm.setString(4, opcoes);
            pstm.setString(5, resposta); 
            pstm.setNull(6, java.sql.Types.VARCHAR); 
            pstm.setNull(7, java.sql.Types.VARCHAR); 
        } catch (SQLException e) {
            System.err.println("Erro ao preparar a inserção da Pergunta: " + e.getMessage());
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
