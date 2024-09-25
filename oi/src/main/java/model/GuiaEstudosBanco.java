package model;

import com.mysql.jdbc.PreparedStatement;

import control.GuiaEstudos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class GuiaEstudosBanco {
    public void inserirGuiaEstudos(GuiaEstudos guiaEstudos){
        String query = "INSERT INTO tbguiaestudos(titulo, dataInicio, dataFim, ramo, resumo, link, arquivo, materia, miniatura) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try{
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            pstm.setString(1, guiaEstudos.getTitulo());
            pstm.setDate(2, guiaEstudos.getDataInicio());
            pstm.setDate(3, guiaEstudos.getDataFim());
            pstm.setString(4, guiaEstudos.getRamo());
            pstm.setString(5, guiaEstudos.getResumo());
            pstm.setString(6, guiaEstudos.getLink());
            pstm.setString(7, guiaEstudos.getArquivo());
            pstm.setInt(8, guiaEstudos.getMateria().getCodMateria());
            pstm.setString(9, guiaEstudos.getMiniatura());
            pstm.execute();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir guia de estudos. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir guia de estudos no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir o guia de estudos: " + e.getMessage());
        }
    }

    public List<GuiaEstudos> selecionarGuiaEstudos(){
        String query = "SELECT * FROM tbguiaestudos";
        List<GuiaEstudos> guiaEstudosList = new ArrayList<GuiaEstudos>();
        ResultSet rset = null;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            rset = pstm.executeQuery();

            while (rset.next()) {
                GuiaEstudos guiasEstudos = new GuiaEstudos();
                guiasEstudos.setCodGuiaEstudos(rset.getInt("cod"));
                guiasEstudos.setTitulo(rset.getString("titulo"));
                guiasEstudos.setDataInicio(rset.getDate("dataInicio"));
                guiasEstudos.setDataFim(rset.getDate("dataFim"));
                guiasEstudos.setRamo(rset.getString("ramo"));
                guiasEstudos.setMiniatura(rset.getString("miniatura"));
                guiasEstudos.setLink(rset.getString("link"));
                guiasEstudos.setResumo(rset.getString("resumo"));
                guiasEstudos.setArquivo(rset.getString("arquivo"));

                Integer codMateria = rset.getInt("materia");
                guiasEstudos.setMateria(MateriaBanco.selecionarMateria(codMateria));
       
                guiasEstudos.setMaterialComplementar(MaterialComplementarBanco.listarMaterialComplementar(guiasEstudos.getCodGuiaEstudos()));
                
                guiaEstudosList.add(guiasEstudos);
            }
            return guiaEstudosList;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar guia de estudos: " + e.getMessage(), e);
        }
    }

    public static GuiaEstudos listarGuiaEstudo(Integer codGuiaEstudos) {
        String query = "SELECT * FROM tbguiaestudo WHERE cod=" + codGuiaEstudos;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            ResultSet rset = pstm.executeQuery();

            if (rset.next()) {
                GuiaEstudos guiaEstudos = new GuiaEstudos();
                guiaEstudos.setCodGuiaEstudos(rset.getInt("cod"));
                guiaEstudos.setTitulo(rset.getString("titulo"));
                guiaEstudos.setDataInicio(rset.getDate("dataInicio"));
                guiaEstudos.setDataFim(rset.getDate("dataFim"));
                guiaEstudos.setRamo(rset.getString("ramo"));
                guiaEstudos.setLink(rset.getString("link"));
                guiaEstudos.setResumo(rset.getString("resumo"));
                guiaEstudos.setArquivo(rset.getString("arquivo"));
                
                Integer codMateria = rset.getInt("materia");
                guiaEstudos.setMateria(MateriaBanco.selecionarMateria(codMateria));
       
                guiaEstudos.setMaterialComplementar(MaterialComplementarBanco.listarMaterialComplementar(guiaEstudos.getCodGuiaEstudos()));
                
                return guiaEstudos;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar guia de estudos: " + e.getMessage(), e);
        }
    }
}
