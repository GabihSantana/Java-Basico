package control;

public class Notificacao {
	private Integer codNotificacao;
    private String titulo;
    private String descricao;
    private boolean visualizado;

    public Notificacao(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.visualizado = false;
    }
    
    public Integer getCodNotificacao() {
		return codNotificacao;
	}

	public void setCodNotificacao(Integer codNotificacao) {
		this.codNotificacao = codNotificacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean getVisualizado() {
		return visualizado;
	}
	
	public void visualizarNotificacao(){
        this.visualizado = true;
    }

    public void deletarNotificacao(){
        //TODO: Função responsável por deletar notificacao;
    }
}
