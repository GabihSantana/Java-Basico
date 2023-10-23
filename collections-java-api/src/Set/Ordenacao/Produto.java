package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private String nome;
	private long codigo;
	private double preço;
	private int quantidade;
	
	public Produto(String nome, long codigo, double preço, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preço = preço;
		this.quantidade = quantidade;
	}

	//consulta em ordem alfabetica - compara por nome do produto
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}

	public String getNome() {
		return nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public double getPreço() {
		return preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String toString() {
		return "Produto [nome=" + nome + ", codigo=" + codigo + ", preço=" + preço + ", quantidade=" + quantidade + "]";
	}

	//Código é único de um produto
	public int hashCode() {
		return Objects.hash(codigo);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}
}

class comparatorPorPreço implements Comparator<Produto>{
	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreço(), p2.getPreço());
	}
}
