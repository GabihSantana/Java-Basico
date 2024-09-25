package model;

import com.mysql.jdbc.PreparedStatement;

import control.Materia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class MateriaBanco {
    public static void inserirMateria(Materia materia){
        String query = "INSERT INTO tbmateria(nome, sigla, desativado, professor) VALUES (?, ?, ?, ?)";

        try{
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            pstm.setString(1, materia.getNome());
            pstm.setString(2, materia.getSigla());
            pstm.setBoolean(3, !materia.getIsAtivo());
            pstm.setInt(4, materia.getProfessor().getMatricula());
            pstm.execute();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir materia. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir materia no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir materia: " + e.getMessage());
        }
    }

    public static Materia selecionarMateria(Integer codMateria) {
        String query = "SELECT * FROM tbmateria WHERE cod=" + codMateria;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            ResultSet rset = pstm.executeQuery();

            if (rset.next()) {
                Materia materia = new Materia();
                materia.setCodMateria(rset.getInt("cod"));
                materia.setNome(rset.getString("nome"));
                materia.setSigla(rset.getString("sigla"));
                materia.setIsAtivo(rset.getBoolean("desativado"));

                Integer matriculaProfessor = rset.getInt("professor");
                materia.setProfessor(ProfessorBanco.selecionarProfessor(matriculaProfessor));

                return materia;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar materia: " + e.getMessage(), e);
        }
    }
    
    public static List<Materia> selecionarMateria() {
        String query = "SELECT * FROM tbmateria";
        List<Materia> materiasList = new ArrayList<>();

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            ResultSet rset = pstm.executeQuery();

            while (rset.next()) {
                Materia materia = new Materia();
                materia.setCodMateria(rset.getInt("cod"));
                materia.setNome(rset.getString("nome"));
                materia.setSigla(rset.getString("sigla"));
                materia.setIsAtivo(rset.getBoolean("desativado"));

                Integer matriculaProfessor = rset.getInt("professor");
                materia.setProfessor(ProfessorBanco.selecionarProfessor(matriculaProfessor));

                materiasList.add(materia);
            }
            return materiasList;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar materias: " + e.getMessage(), e);
        }
    }

}
