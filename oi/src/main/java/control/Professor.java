package control;

public class Professor {
    private String especialidade;
    private Integer matricula;
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String telefone;
    private String endereco;

    public Professor(){

    }

    public Professor(String especialidadeProfessor, String nomeProfessor, String cpfProfessor, String rgProfessor, String emailProfessor, String telefoneProfessor, String enderecoProfessor) {
        this.especialidade = especialidadeProfessor;
        this.nome = nomeProfessor;
        this.cpf = cpfProfessor;
        this.rg = rgProfessor;
        this.email = emailProfessor;
        this.telefone = telefoneProfessor;
        this.endereco = enderecoProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void alterarDados(String email, String telefone, String endereco){
        //TODO: Função responsável por editar os dados do professor;
    }
}
