package control;

import com.mysql.jdbc.PreparedStatement;

public class AtividadeColaborativa extends ArtefatoInteratividade {
    private String requisitos;
    private String entregaveis;

    public AtividadeColaborativa(String tipo, String titulo, String descricao, String requisitos, String entregaveis) {
        super(tipo, titulo, descricao);
        this.requisitos = requisitos;
        this.entregaveis = entregaveis;
    }

    public String getEntregaveis() {
        return entregaveis;
    }

    public void setEntregaveis(String entregaveis) {
        this.entregaveis = entregaveis;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    @Override
    public void deletarArtefato() {
        //TODO: deletar artefato
    }

    @Override
    public void editarArtefato() {
        //TODO: editar artefato
    }

	@Override
	public void prepararInsercao(PreparedStatement pstm) {
		// Implementação adiada
	}
}
