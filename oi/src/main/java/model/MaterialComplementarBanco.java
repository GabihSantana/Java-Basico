package model;

import com.mysql.jdbc.PreparedStatement;

import control.MaterialComplementar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class MaterialComplementarBanco {
	//Essa classe foi feita para instanciar junto ao guia de estudos, mas seus dados não estão sendo exibidos.
    public static void inserirMaterialComplementar(MaterialComplementar materialComplementar, Integer codGuiaEstudos) {
        String query = "INSERT INTO tbmaterialcomplementar(cod, arquivo, titulo, miniatura, descricao, guiaestudos) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            pstm.setInt(1, materialComplementar.getCodMaterialComplementar());
            pstm.setString(2, materialComplementar.getArquivo());
            pstm.setString(3, materialComplementar.getTitulo());
            pstm.setString(4, materialComplementar.getMiniatura());
            pstm.setString(5, materialComplementar.getDescricao());
            pstm.setInt(6, codGuiaEstudos);
            pstm.execute();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir o material complementar. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir o material complementar no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir material complementar: " + e.getMessage());
        }
    }
    
    public static void inserirMaterialComplementar(MaterialComplementar materialComplementar) {
        String query = "INSERT INTO tbmaterialcomplementar(cod, arquivo, titulo, miniatura, descricao) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            pstm.setInt(1, materialComplementar.getCodMaterialComplementar());
            pstm.setString(2, materialComplementar.getArquivo());
            pstm.setString(3, materialComplementar.getTitulo());
            pstm.setString(4, materialComplementar.getMiniatura());
            pstm.setString(5, materialComplementar.getDescricao());
            pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar material complementar: " + e.getMessage(), e);
        }
    }

    public static List<MaterialComplementar> listarMaterialComplementar(Integer codGuiaEstudos) {
        String query = "SELECT * FROM tbmaterialcomplementar WHERE guiaestudos="+codGuiaEstudos;
        List<MaterialComplementar> materialComplementarList = new ArrayList<MaterialComplementar>();
        ResultSet rset = null;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            rset = pstm.executeQuery();

            while (rset.next()) {
                MaterialComplementar materialComplementar = new MaterialComplementar();
                materialComplementar.setCodMaterialComplementar(rset.getInt("cod"));
                materialComplementar.setArquivo(rset.getString("arquivo"));
                materialComplementar.setTitulo(rset.getString("titulo"));
                materialComplementar.setMiniatura(rset.getString("miniatura"));
                materialComplementar.setDescricao(rset.getString("descricao"));
                materialComplementarList.add(materialComplementar);
            }
            return materialComplementarList;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir material complementar: " + e.getMessage(), e);
        }
    }
}
