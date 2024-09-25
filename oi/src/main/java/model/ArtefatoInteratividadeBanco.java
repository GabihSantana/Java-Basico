package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import control.ArtefatoInteratividade;
import control.Desafio;
import control.Enquete;
import control.Pergunta;

public class ArtefatoInteratividadeBanco {
	public void inserirArtefatoInteratividade(ArtefatoInteratividade artefato) {
        String query = "CALL inserirArtefatoInteratividade(?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = (Connection) Conexao.conexaoMySql();
             PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query)) {

            pstm.setString(1, artefato.getTipo());
            pstm.setString(2, artefato.getTitulo());
            pstm.setString(3, artefato.getDescricao());
            artefato.prepararInsercao(pstm);

            pstm.execute();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados. Verifique os dados inseridos e tente novamente.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir o artefato de interatividade: " + e.getMessage(), e);
        }
    }
	
	//Metódo feito para listagem, mas sem implementação no código. 
	public List<ArtefatoInteratividade> listarArtefatosInteratividade() {
        String query = "CALL listarTodosArtefatosInteratividade()";  
        List<ArtefatoInteratividade> artefatos = new ArrayList<>();

        try (Connection conn = (Connection) Conexao.conexaoMySql();
             PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                String tipo = rs.getString("tipo");
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                String opcoes = rs.getString("opcoes");
                String resposta = rs.getString("resposta");
                String requisitos = rs.getString("requisitos");
                String entregaveis = rs.getString("entregaveis");

                ArtefatoInteratividade artefato = criarArtefato(tipo, titulo, descricao, opcoes, resposta, requisitos, entregaveis);
                artefatos.add(artefato);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar artefatos de interatividade: " + e.getMessage());
            e.printStackTrace();
        }
        return artefatos;
    }
	
	//Metódo feito para listagem, mas sem implementação no código. 
	public static ArtefatoInteratividade criarArtefato(String tipo, String titulo, String descricao, String opcoes, String resposta, String requisitos, String entregaveis) {
        switch (tipo) {
            case "Pergunta":
                return new Pergunta(tipo, titulo, descricao, opcoes, resposta);
            case "Enquete":
                return new Enquete(tipo, titulo, descricao, opcoes);
            case "Desafio":
                return new Desafio(tipo, titulo, descricao, requisitos, opcoes);
            default:
                throw new IllegalArgumentException("Tipo de artefato desconhecido: " + tipo);
        }
    }
}
