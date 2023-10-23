package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	private Set<Produto> produtoSet;

	public CadastroProduto() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new comparatorPorPreço());
		produtoSet.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProduto cadastroProdutos = new CadastroProduto();
		
		cadastroProdutos.adicionarProduto("Smartphone", 1L, 1000d, 10);
		cadastroProdutos.adicionarProduto("Notebook", 2L, 1500d, 5);
		cadastroProdutos.adicionarProduto("Mouse", 1L, 30d, 20);
		cadastroProdutos.adicionarProduto("Teclado", 4L, 50d, 15);
		
	    System.out.println(cadastroProdutos.produtoSet);
	    
	    System.out.println(cadastroProdutos.exibirProdutosPorNome());
	    
	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());

	}
}
