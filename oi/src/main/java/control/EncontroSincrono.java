package control;

import java.sql.Date;

public class EncontroSincrono {
    private Integer codEncontroSincrono;
    private String assunto;
    private String descricao;
    private Date dataHorario;
    private String tags;
    private String linkConteudo;
    private String ramo;
    
    public EncontroSincrono() {
        
    }
    
    public EncontroSincrono(String assunto, String descricao, Date dataHorario, String tags, String linkConteudo, String ramo) {
        this.assunto = assunto;
        this.descricao = descricao;
        this.dataHorario = dataHorario;
        this.tags = tags;
        this.linkConteudo = linkConteudo;
        this.ramo = ramo;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getLinkConteudo() {
        return linkConteudo;
    }

    public void setLinkConteudo(String linkConteudo) {
        this.linkConteudo = linkConteudo;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(Date dataHorario) {
        this.dataHorario = dataHorario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Integer getCodEncontroSincrono() {
        return codEncontroSincrono;
    }

    public void setCodEncontroSincrono(Integer codEncontroSincrono) {
        this.codEncontroSincrono = codEncontroSincrono;
    }

    public void participarEncontro(){
        //TODO: Função responsável por permitir a entreda no encontro sincrono;
    }

    public void agendarEncontro(){
        //TODO: Função responsável por agendar o encontro sincrono;
    }

    public void gravarEncontro(){
        //TODO: Função responsável por gravar o encontro sincrono;
    }

    public void criarInteracao(){
        //TODO: Função responsável por criar uma interação ao vivo com os alunos;
    }
}
