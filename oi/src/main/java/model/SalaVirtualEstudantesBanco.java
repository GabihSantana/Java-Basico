package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import control.Estudante;
import control.SalaVirtual;

public class SalaVirtualEstudantesBanco {
	public void inserirSalaVirtualEstudantes(SalaVirtual salaVirtual, List<Estudante> estudantes){
        String query = "INSERT INTO tbestudantes_salavirtual(estudante, salavirtual) VALUES (?, ?)";

        try{
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);

            for (Estudante estudante : estudantes) {
                pstm.setInt(1, estudante.getMatricula());
                pstm.setInt(2, salaVirtual.getCodSalaVirtual());
                pstm.addBatch();
            }

            pstm.executeBatch();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir estudantes na sala virtual. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir estudantes na sala virtual no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir estudantes na sala virtual: " + e.getMessage());
        }
    }
	
	public static List<Integer> listarEstudantesPorSalaVirtual(Integer salaVirtual) {
	    String query = "SELECT estudante FROM tbestudantes_salavitual WHERE salavirtual = ?";
	    
	    List<Integer> estudantes = new ArrayList<>();

	    try {
	        Connection conn = Conexao.conexaoMySql();
	        PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
	        pstm.setInt(1, salaVirtual);
	        ResultSet rs = pstm.executeQuery();

	        while (rs.next()) {
	            int matriculaEstudante = rs.getInt("estudante");
	            estudantes.add(matriculaEstudante);
	        }
	    } catch (SQLException e) {
	        System.err.println("Erro ao listar os estudantes da sala virtual no banco de dados.");
	        throw new RuntimeException("Erro ao listar estudantes da sala virtual: " + e.getMessage());
	    }

	    return estudantes;
	}

}
