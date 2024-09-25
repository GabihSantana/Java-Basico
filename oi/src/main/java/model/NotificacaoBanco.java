package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.mysql.jdbc.PreparedStatement;

import control.Notificacao;

public class NotificacaoBanco {
	//Novamente, metodo sem implementação no código
	public void inserirGuiaEstudos(Notificacao notificacao, Integer codAtividade){
        String query = "INSERT INTO tbnotificacao(titulo, descricao, visualizado, atividade) VALUES (?, ?, ?, ?)";

        try{
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            pstm.setString(1, notificacao.getTitulo());
            pstm.setString(2, notificacao.getDescricao());
            pstm.setBoolean(3, notificacao.getVisualizado());
            pstm.setInt(4, codAtividade);
            pstm.execute();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir notificação. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir notificação no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir o notificação: " + e.getMessage());
        }
    }
}
