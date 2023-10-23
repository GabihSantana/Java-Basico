package Set.OperacoesBasicas;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoConvidados {
	//atributo
	
	private Set<Convidado> convidadosSet;

	public ConjuntoConvidados() {
		this.convidadosSet = new LinkedHashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadosSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadosSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadosSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadosSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadosSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidado = new ConjuntoConvidados();
		
		 System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");
		 conjuntoConvidado.adicionarConvidado("Duda", 1234);
		 conjuntoConvidado.adicionarConvidado("João", 1235);
		 conjuntoConvidado.adicionarConvidado("Maria", 1235);
		 conjuntoConvidado.adicionarConvidado("Joana", 1236);

		 System.out.println("Convidados no conjunto:");
		 conjuntoConvidado.exibirConvidados();
		 
		 System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");

		 conjuntoConvidado.removerConvidadoPorCodigoConvite(1235);
		 System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

		 System.out.println("Convidados no conjunto após a remoção:");
		 conjuntoConvidado.exibirConvidados();
	}
}
