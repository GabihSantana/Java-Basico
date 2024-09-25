package control;

public class ChatSala {
    private Integer codChat;
    private String titulo;

    public ChatSala() {
       
    }
    
    public ChatSala(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCodChat() {
        return codChat;
    }

    public void setCodChat(Integer codChat) {
        this.codChat = codChat;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void atualizarChat(){
        //TODO: Função responsável por atualizar o chat;
    }

    public void carregarChat(){
        //TODO: Função responsável por carregar as mensagens o chat;
    }

    public void arquivarChat(){
        //TODO: Função responsável por salvar as mesagens o chat;
    }

    public void consultarHistoricoChat(){
        //TODO: Função responsável por consultar histórico o chat;
    }
}
