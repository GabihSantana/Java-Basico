package control;

public class Materia {
    private Integer codMateria;
    private String nome;
    private String sigla;
    private Professor professor;
    private boolean isAtivo;

    public Materia() {

    }

    public Materia(String nome, String sigla, Professor professor) {
        this.nome = nome;
        this.sigla = sigla;
        this.isAtivo = true;
        this.professor = professor;
    }

    public Integer getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(Integer codMateria) {
        this.codMateria = codMateria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public boolean getIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(boolean ativo) {
        isAtivo = ativo;
    }

    public void alterarIsAtivo() {
        this.isAtivo = !this.isAtivo;
    }

    public void adicionarProfessor(Professor professor) {
        if (professor == null) {
            throw new IllegalArgumentException("Professor está vazio.");
        }
        this.professor = professor;
    }  
}
