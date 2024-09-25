package control;
import java.time.LocalDateTime;

public class Mensagem {
    private Integer codMensagem;
    private String texto;
    private String arquivo;
    private LocalDateTime dataHora;
    private String remetente;

    public Mensagem(String remetente, String arquivo, String texto, LocalDateTime dataHora) {
        this.remetente = remetente;
        this.arquivo = arquivo;
        this.texto = texto;
        this.dataHora = dataHora;
    }

    public Mensagem(String remetente, String texto, LocalDateTime dataHora) {
        this.remetente = remetente;
        this.texto = texto;
        this.dataHora = dataHora;
    }

    public Integer getCodMensagem() {
        return codMensagem;
    }

    public void setCodMensagem(Integer codMensagem) {
        this.codMensagem = codMensagem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public void enviarMensagem(){
        //TODO: Função responsável por enviar mensagem ao chat;
    }

    public void deletarMensagem(){
        //TODO: Função responsável por deletar mensagem enviada ao chat;
    }
}
