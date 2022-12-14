package entities;

public class Product {
	private String nome;
	private Double preco;
	private Integer quantidade;

	public Product() {

	}

	public Product(String nome, Double pre?o, Integer quantidade) {
		super();
		this.nome = nome;
		this.preco = pre?o;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPre?o() {
		return preco;
	}

	public void setPre?o(Double pre?o) {
		this.preco = pre?o;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double calcDesc() {
		if (quantidade <= 10) {
			return quantidade * preco;
		} else if (quantidade >= 11 == quantidade <= 20) {
			return 0.10 * (preco * quantidade);
		} else if (quantidade >= 21 == quantidade <= 50) {
			return 0.20 * (preco * quantidade);
		} else {
			return 0.25 * (preco * quantidade);
		}
	}

	public double calcVenda() {
		return (preco * quantidade)-calcDesc();

	};

	@Override
	public String toString() {
		return "Product [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

}
