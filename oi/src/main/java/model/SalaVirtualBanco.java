package model;

import com.mysql.jdbc.PreparedStatement;

import control.Estudante;
import control.SalaVirtual;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class SalaVirtualBanco {
	public static void inserirSalaVirtual(SalaVirtual salaVirtual, List<Estudante> estudantesSelecionados) {
        String querySala = "INSERT INTO tbsalavirtual(nome, descricao, volumetriaEstudantes, materia, chat) VALUES (?, ?, ?, ?, ?)";
        
        try {        	
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstmSala = (PreparedStatement) conn.prepareStatement(querySala, PreparedStatement.RETURN_GENERATED_KEYS);
            
            int chatCod = ChatSalaBanco.inserirChat("Chat de " + salaVirtual.getNome());

            pstmSala.setString(1, salaVirtual.getNome());
            pstmSala.setString(2, salaVirtual.getDescricao());
            pstmSala.setInt(3, salaVirtual.getVolumetria());
            pstmSala.setInt(4, salaVirtual.getMateria().getCodMateria());
            pstmSala.setInt(5, chatCod);
            pstmSala.execute();

            ResultSet generatedKeys = pstmSala.getGeneratedKeys();
            int salaVirtualCod = -1;
            if (generatedKeys.next()) {
                salaVirtualCod = generatedKeys.getInt(1);
                salaVirtual.setCodSalaVirtual(salaVirtualCod);  
            }

            if (salaVirtualCod != -1) {
                SalaVirtualEstudantesBanco salaVirtualEstudantesBanco = new SalaVirtualEstudantesBanco();
                salaVirtualEstudantesBanco.inserirSalaVirtualEstudantes(salaVirtual, estudantesSelecionados);
            }
            
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Erro: Violação de integridade do banco de dados ao inserir a sala virtual. Verifique os dados e tente novamente.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir a sala virtual no banco de dados. Verifique os dados e tente novamente.");
            throw new RuntimeException("Erro ao inserir a sala virtual: " + e.getMessage());
        }
    }
    
    public List<SalaVirtual> selecionarSalaVirtual(){
        String query = "SELECT * FROM tbsalavirtual";
        List<SalaVirtual> salaVirtualList = new ArrayList<SalaVirtual>();
        ResultSet rset = null;

        try {
            Connection conn = Conexao.conexaoMySql();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(query);
            rset = pstm.executeQuery();

            while (rset.next()) {
                SalaVirtual salasVirtuais = new SalaVirtual();
                salasVirtuais.setCodSalaVirtual(rset.getInt("cod"));
                salasVirtuais.setNome(rset.getString("nome"));
                salasVirtuais.setDescricao(rset.getString("descricao"));
                salasVirtuais.setVolumetria(rset.getInt("volumetriaEstudantes"));


                Integer codMateria = rset.getInt("materia");
                salasVirtuais.setMateria(MateriaBanco.selecionarMateria(codMateria));
                
                Integer codChat = rset.getInt("chat");
                salasVirtuais.setChatSala(ChatSalaBanco.selecionarChat(codChat));
                
                salaVirtualList.add(salasVirtuais);
            }
            return salaVirtualList;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir a sala virtual: " + e.getMessage(), e);
        }
    }
}
