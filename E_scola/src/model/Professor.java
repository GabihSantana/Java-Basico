package model;

public class Professor {
	private String especialidadeProfessor;
	private String matricula;
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	
	public Professor(String especialidadeProfessor, String matricula, String nome, String cpf, String endereco,
			String email, String telefone) {
		super();
		this.especialidadeProfessor = especialidadeProfessor;
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getEspecialidadeProfessor() {
		return especialidadeProfessor;
	}
	public void setEspecialidadeProfessor(String especialidadeProfessor) {
		this.especialidadeProfessor = especialidadeProfessor;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
