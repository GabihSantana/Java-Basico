package control;

public class MaterialComplementar {
    private Integer codMaterialComplementar;
    private String arquivo;
    private String titulo;
    private String miniatura;
    private String descricao;

    public MaterialComplementar() {

    }

    public MaterialComplementar(String arquivo, String titulo, String miniatura, String descricao) {
        this.arquivo = arquivo;
        this.titulo = titulo;
        this.miniatura = miniatura;
        this.descricao = descricao;
    }

    public Integer getCodMaterialComplementar() {
        return codMaterialComplementar;
    }

    public void setCodMaterialComplementar(Integer codMaterialComplementar) {
        this.codMaterialComplementar = codMaterialComplementar;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura = miniatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void editarMaterial(String arquivo, String titulo, String miniatura, String descricao){
        //TODO: Função responsável por editar material complementar;
    }

    public void deletarMaterial(){
        //TODO: Função responsável por deletar material complementar;
    }

    public void listarMaterial(){
        //TODO: Função responsável por listar materiais complementares;
    }
}
