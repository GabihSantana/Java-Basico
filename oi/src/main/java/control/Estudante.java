package control;

public class Estudante {
    private Integer matricula;
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String telefone;
    private String endereco;
    private String escola;

    public Estudante() {
        
    }
    
    public Estudante(String nome, String cpf, String rg, String email, String telefone, String endereco, String escola, SalaVirtual salaVirtual) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.escola = escola;
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

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void alterarDados(String email, String telefone, String endereco) {
        //TODO: Função responsável por editar os dados do estudante;
    }
}
