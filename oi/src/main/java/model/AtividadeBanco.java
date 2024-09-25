package model;

import com.mysql.cj.xdevapi.Result;
import com.mysql.jdbc.PreparedStatement;

import control.Atividade;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
//import java.util.ArrayList;
//import java.util.List;

public class AtividadeBanco {
	
	public AtividadeBanco() {
	
	}
	
	
	public void inserirAtividade(Atividade atividade) {
        String query = "INSERT INTO tbatividade(nome, dataInicio, dataTermino, salavirtual, artefatointeratividade) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            pstm.setString(1, atividade.getNome());
            pstm.setDate(2, (Date) atividade.getDataInicio());
            pstm.setDate(3, (Date) atividade.getDataTermino());
            pstm.setInt(4, atividade.getSalaVirtual().getCodSalaVirtual());
            pstm.setInt(5, atividade.getArtefatoInteratividade().getCodArtefato());
            pstm.execute();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados. Verifique os dados inseridos e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir a atividade no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir a atividade: " + e.getMessage());
        }
    }

	public ResultSet select () {
        String query = "SELECT  cod, nome, dataInicio, dataTermino, salavirtual, artefatointeratividade FROM dbescola.tbatividade;";

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            
            ResultSet rs =  pstm.executeQuery(query);
            while (rs.next()) {
            	System.out.println( rs.getString("nome") + "\n" );
			}
            
            return( rs );
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados. Verifique os dados inseridos e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir a atividade no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir a atividade: " + e.getMessage());
        }
		return null;
    }
	
	
	
	//Metodo responsavel por listar atividades, mas por estar fora do escopo dos casos de uso foi descontinuado.
	/*public static List<Atividade> selecionarAtividade(SalaVirtual salaVirtual) {
        String query = "SELECT * FROM tbatividade WHERE cod=" + salaVirtual.getCodSalaVirtual();
        List<Atividade> atividadeList = new ArrayList<>();

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            ResultSet rset = pstm.executeQuery();

            while (rset.next()) {
                Atividade atividade = new Atividade();
                atividade.setCodAtividade(rset.getInt("cod"));
                atividade.setNome(rset.getString("nome"));
                atividade.setDataInicio(rset.getDate("dataInicio"));
                atividade.setDataTermino(rset.getDate("dataTermino"));
                atividade.setSalaVirtual(salaVirtual);

                // Falta selecionar os artefatos

                atividadeList.add(atividade);
            }
            return atividadeList;
        } catch (SQLException e) {
            System.err.println("Erro ao selecionar a atividade no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao selecionar a atividade: " + e.getMessage());
        }
    }*/
}
