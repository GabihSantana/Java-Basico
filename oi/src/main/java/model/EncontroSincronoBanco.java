package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import control.EncontroSincrono;

public class EncontroSincronoBanco {
	//Essa classe foi feita para inserir notificações, mas devido ao tempo e contexto do projeto (Fora dos casos de uso), não foram implementados os metodos.
    public static void inserirEncontroSincrono(EncontroSincrono encontroSincrono) {
        String query = "INSERT INTO tbencontrosincrono(cod, assunto, descricao, dataHorario, tags, linkConteudo, ramo, atividade) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = conn.prepareStatement(query);

            pstm.setInt(1, encontroSincrono.getCodEncontroSincrono());
            pstm.setString(2, encontroSincrono.getAssunto());
            pstm.setString(3, encontroSincrono.getDescricao());
            pstm.setDate(4, encontroSincrono.getDataHorario());
            pstm.setString(5, encontroSincrono.getTags());
            pstm.setString(6, encontroSincrono.getLinkConteudo());
            pstm.setString(7, encontroSincrono.getRamo());
            pstm.execute();
        }  catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir o encontro síncrono. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir o encontro síncrono: " + e.getMessage(), e);
        }
    }
    
    public static EncontroSincrono listarEncontroSincrono(int cod) {
        String query = "SELECT cod, assunto, descricao, dataHorario, tags, linkConteudo, ramo, atividade FROM tbencontrosincrono WHERE cod = ?";
        EncontroSincrono encontroSincrono = null;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, cod);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                encontroSincrono = new EncontroSincrono();
                encontroSincrono.setCodEncontroSincrono(rs.getInt("cod"));
                encontroSincrono.setAssunto(rs.getString("assunto"));
                encontroSincrono.setDescricao(rs.getString("descricao"));
                encontroSincrono.setDataHorario(rs.getDate("dataHorario"));
                encontroSincrono.setTags(rs.getString("tags"));
                encontroSincrono.setLinkConteudo(rs.getString("linkConteudo"));
                encontroSincrono.setRamo(rs.getString("ramo"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar o encontro síncrono: " + e.getMessage(), e);
        }

        return encontroSincrono;
    }
}
