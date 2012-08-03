package core.tdl;

public class Flor {

	private String id;
	private double preco;
	private Esp especificacao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Esp getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(Esp especificacao) {
		this.especificacao = especificacao;
	}

	public Flor() {
	}

	public Flor(String id, double preco, Esp especificacaoArg) {
		this.setId(id);
		this.setPreco(preco);
		this.setEspecificacao(especificacaoArg);
	}

}
