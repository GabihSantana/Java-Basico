package model;

public class ChatDaSala {
	private String titulo;
	private Integer participantes;
	
	public ChatDaSala(String titulo, Integer participantes) {
		super();
		this.titulo = titulo;
		this.participantes = participantes;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Integer participantes) {
		this.participantes = participantes;
	}
}
