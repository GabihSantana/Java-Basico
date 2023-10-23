package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoalist;

	public OrdenacaoPessoa() {
		this.pessoalist = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoalist.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoalist);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoalist);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public static void main(String[] args) {
//		  Criando uma instância da classe OrdenacaoPessoas
		OrdenacaoPessoa ordenacaoPessoa =  new OrdenacaoPessoa();

		ordenacaoPessoa.adicionarPessoa("Camile", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("José", 30, 1.80);
		ordenacaoPessoa.adicionarPessoa("Carmen", 25, 1.70);
		ordenacaoPessoa.adicionarPessoa("Pedro", 17, 1.56);

		System.out.println(ordenacaoPessoa.pessoalist);

		System.out.println(ordenacaoPessoa.ordenarPorIdade());

		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
}
