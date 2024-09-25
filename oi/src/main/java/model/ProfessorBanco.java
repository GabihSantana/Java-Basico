package model;

import com.mysql.jdbc.PreparedStatement;

import control.Professor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class ProfessorBanco {
    public static void inserirProfessor(Professor professor){
        String query = "INSERT INTO tbprofessor(especialidade, nome, cpf, rg, email, telefone, endereco) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try{
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            pstm.setString(1, professor.getEspecialidade());
            pstm.setString(2, professor.getNome());
            pstm.setString(3, professor.getCpf());
            pstm.setString(4, professor.getRg());
            pstm.setString(5, professor.getEmail());
            pstm.setString(6, professor.getTelefone());
            pstm.setString(7, professor.getEndereco());
            pstm.execute();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir professor. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir o professor no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir o professor: " + e.getMessage());
        }
    }

    public static Professor selecionarProfessor(Integer codProfessor) {
        String query = "SELECT * FROM tbprofessor WHERE matricula=" + codProfessor;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            ResultSet rset = pstm.executeQuery();

            if (rset.next()) {
                Professor professor = new Professor();
                professor.setMatricula(rset.getInt("matricula"));
                professor.setEspecialidade(rset.getString("especialidade"));
                professor.setNome(rset.getString("nome"));
                professor.setCpf(rset.getString("cpf"));
                professor.setRg(rset.getString("rg"));
                professor.setEmail(rset.getString("email"));
                professor.setTelefone(rset.getString("telefone"));
                professor.setEndereco(rset.getString("endereco"));
                return professor;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar o professor: " + e.getMessage(), e);
        }
    }
}
