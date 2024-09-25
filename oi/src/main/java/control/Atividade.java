package control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Atividade {
    private Integer codAtividade;
    private String nome;
    private Date dataInicio;
    private Date dataTermino;
    private SalaVirtual salaVirtual;
    private ArtefatoInteratividade artefatoInteratividade;
    private EncontroSincrono encontroSincrono;
    private final List<Notificacao> notificacaoList = new ArrayList<>();

    public Atividade(){

    }

    public Atividade(EncontroSincrono encontroSincrono, ArtefatoInteratividade artefatoInteratividade, Notificacao notificacao, SalaVirtual salaVirtual, Date dataTermino, Date dataInicio, String nome) {
        this.encontroSincrono = encontroSincrono;
        this.artefatoInteratividade = artefatoInteratividade;
        this.salaVirtual = salaVirtual;
        this.dataTermino = dataTermino;
        this.dataInicio = dataInicio;
        this.nome = nome;
    }

    public Atividade(ArtefatoInteratividade artefatoInteratividade, Notificacao notificacao, SalaVirtual salaVirtual, Date dataTermino, Date dataInicio, String nome) {
        this.artefatoInteratividade = artefatoInteratividade;
        this.salaVirtual = salaVirtual;
        this.dataTermino = dataTermino;
        this.dataInicio = dataInicio;
        this.nome = nome;
    }

    public Integer getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(Integer codAtividade) {
        this.codAtividade = codAtividade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public SalaVirtual getSalaVirtual() {
        return salaVirtual;
    }

    public void setSalaVirtual(SalaVirtual salaVirtual) {
        this.salaVirtual = salaVirtual;
    }

    public List<Notificacao> getNotificacaoList() {
        return notificacaoList;
    }

    public ArtefatoInteratividade getArtefatoInteratividade() {
        return artefatoInteratividade;
    }

    public void setArtefatoInteratividade(ArtefatoInteratividade artefatoInteratividade) {
        this.artefatoInteratividade = artefatoInteratividade;
    }

    public EncontroSincrono getEncontroSincrono() {
        return encontroSincrono;
    }

    public void setEncontroSincrono(EncontroSincrono encontroSincrono) {
        this.encontroSincrono = encontroSincrono;
    }

    public void consultarAtividade(){
        //TODO: função responsável por consultar atividade.
    }

    public void deletarAtividade(){
        //TODO: função responsável por deletar atividade.
    }
}
