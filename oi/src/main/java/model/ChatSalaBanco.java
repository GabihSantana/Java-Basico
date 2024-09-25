package model;

import com.mysql.jdbc.PreparedStatement;

import control.ChatSala;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class ChatSalaBanco {
	public static int inserirChat(String titulo) {
        String query = "INSERT INTO tbchatsala(titulo) VALUES (?)";
        int generatedKey = 0;

        try (Connection conn = Conexao.conexaoMySql();
             PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {

            pstm.setString(1, titulo);
            pstm.executeUpdate();

            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir o chat. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir o chat no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir o chat: " + e.getMessage());
        }
        return generatedKey;
    }

    public static ChatSala selecionarChat(Integer codChat) {
        String query = "SELECT * FROM tbchatsala WHERE cod=" + codChat;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            ResultSet rset = pstm.executeQuery();

            if (rset.next()) {
                ChatSala chatSala = new ChatSala();
                chatSala.setCodChat(rset.getInt("cod"));
                chatSala.setTitulo(rset.getString("titulo"));
                return chatSala;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao selecionar o chat no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao selecionar o chat: " + e.getMessage());
        }
    }
}
