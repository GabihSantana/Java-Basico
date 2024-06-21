package model;

public class Estudante {
	private String matricula;
	private String nome;
	private String escola;
	private String cpf;
	private String rg;
	private String endereco;
	private String email;
	private String telefone;
	
	public Estudante(String matricula, String nome, String escola, String cpf, String rg, String endereco, String email,
			String telefone) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.escola = escola;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
}
