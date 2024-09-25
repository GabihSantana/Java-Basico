package control;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class GuiaEstudos {
    private Integer codGuiaEstudos;
    private String titulo;
    private Date dataInicio;
    private Date dataFim;
    private String ramo;
    private Materia materia;
    private String resumo;
    private String link;
    private String arquivo;
    private String miniatura;
    private List<MaterialComplementar> materialComplementarList = new ArrayList<>();

    public GuiaEstudos() {

    }

    public GuiaEstudos(String titulo, Date dataInicio, Date dataFim, String ramo, Materia materia, String resumo, String link, String arquivo, String miniatura) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ramo = ramo;
        this.materia = materia;
        this.resumo = resumo;
        this.link = link;
        this.arquivo = arquivo;
        this.miniatura = miniatura;
    }

    public GuiaEstudos(String titulo, Date dataInicio, Date dataFim, String ramo, Materia materia, String resumo, String link, MaterialComplementar materialComplementar, String arquivo, String miniatura) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ramo = ramo;
        this.materia = materia;
        this.resumo = resumo;
        this.link = link;
        this.arquivo = arquivo;
        this.miniatura = miniatura;
        this.materialComplementarList.add(materialComplementar);
    }

    public List<MaterialComplementar> getMaterialComplementar() {
        return materialComplementarList;
    }
    
    public void setMaterialComplementar(List<MaterialComplementar> materialComplementar) {
    	this.materialComplementarList = materialComplementar;
    }
    
    public String getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura = miniatura;
    }
    
    public Integer getCodGuiaEstudos() {
        return codGuiaEstudos;
    }

    public void setCodGuiaEstudos(Integer codGuiaEstudos) {
        this.codGuiaEstudos = codGuiaEstudos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public void atualizarGuia(String titulo, Date dataInicio, Date dataFim, String ramo){
        //TODO: Função responsável por atualizar guia;
    }

    public void deletarGuia(){
        //TODO: Função responsável por deletar o guia;
    }

    public void adicionarMaterialComplementar(MaterialComplementar material){
        //TODO: Função responsável por adicionar materiais complementares ao guia;
    }
}
