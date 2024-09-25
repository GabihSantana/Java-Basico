package control;

public class SalaVirtual {
    private Integer codSalaVirtual;
    private String nome;
    private String descricao;
    private Integer volumetria;
    private Materia materia;
    private boolean isAtivo;
    private ChatSala chatSala;

    public SalaVirtual() {
        
    }
    
    public SalaVirtual(String nome, String descricao, Materia materia, ChatSala chatSala) {
        this.nome = nome;
        this.descricao = descricao;
        this.materia = materia;
        this.chatSala = chatSala;
        this.volumetria = 0;
    }

    public Integer getCodSalaVirtual() {
        return codSalaVirtual;
    }

    public void setCodSalaVirtual(Integer codSalaVirtual) {
        this.codSalaVirtual = codSalaVirtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getVolumetria() {
        return volumetria;
    }

    public void setVolumetria(Integer volumetria) {
        this.volumetria = volumetria;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public boolean getIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(boolean ativo) {
        isAtivo = ativo;
    }

    public ChatSala getChatSala() {
        return chatSala;
    }

    public void setChatSala(ChatSala chatSala) {
        this.chatSala = chatSala;
    }

    public void alterarIsAtivo(){
        this.isAtivo = !this.isAtivo;
    }

    public void atualizarSalaVirtual(String nome, String descricao, String miniatura) {
        //TODO: Função responsável por atualizar dados da sala virtual;
    }
}
