package model;

import com.mysql.jdbc.PreparedStatement;

import control.Estudante;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class EstudanteBanco {
    public void inserirEstudante(Estudante estudante){
        String query = "INSERT INTO tbestudante(nome, cpf, rg, email, telefone, endereco, escola) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try{
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            pstm.setString(1, estudante.getNome());
            pstm.setString(2, estudante.getCpf());
            pstm.setString(3, estudante.getRg());
            pstm.setString(4, estudante.getEmail());
            pstm.setString(5, estudante.getTelefone());
            pstm.setString(6, estudante.getEndereco());
            pstm.setString(7, estudante.getEscola());
            pstm.execute();

        }  catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir o estudante. Verifique os dados e tente novamente.");
        }  catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir o estudante: " + e.getMessage(), e);
        }
    }

    public static List<Estudante> selecionarEstudantes(){
        String query = "SELECT * FROM tbestudante";
        List<Estudante> EstudanteList = new ArrayList<Estudante>();
        ResultSet rset = null;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Estudante estudantes = new Estudante();
                estudantes.setMatricula(rset.getInt("matricula"));
                estudantes.setNome(rset.getString("nome"));
                estudantes.setCpf(rset.getString("cpf"));
                estudantes.setRg(rset.getString("rg"));
                estudantes.setEmail(rset.getString("email"));
                estudantes.setTelefone(rset.getString("telefone"));
                estudantes.setEndereco(rset.getString("endereco"));
                estudantes.setEscola(rset.getString("escola"));
              
                EstudanteList.add(estudantes);
            }
            return EstudanteList;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar o aluno: " + e.getMessage(), e);
        }
    }
}
