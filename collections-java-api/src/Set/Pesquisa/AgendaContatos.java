package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<Contato>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero){
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c; 
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContato = new AgendaContatos();
		
		agendaContato.exibirContatos();
		
		agendaContato.adicionarContato("João", 123456789);
		agendaContato.adicionarContato("João", 125456789);
		agendaContato.adicionarContato("Maria", 987654321);
		agendaContato.adicionarContato("Maria Silva", 55555555);
		agendaContato.adicionarContato("Carla", 88889999);
		agendaContato.adicionarContato("Duda", 77778888);
		agendaContato.adicionarContato("Bia", 55555555);
		
		agendaContato.exibirContatos();

		System.out.println(agendaContato.pesquisarPorNome("Maria"));
		
		Contato contatoAtualizado = agendaContato.atualizarNumeroContato("Carla", 44443333);
	    System.out.println("Contato atualizado: " + contatoAtualizado);
	    
	    System.out.println("Contatos na agenda após atualização:");
	    agendaContato.exibirContatos();
	}
	
}
