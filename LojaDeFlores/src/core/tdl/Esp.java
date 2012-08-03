package core.tdl;

public class Esp {

	private String tipo;
	private String cor;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Esp() {
	}

	public Esp(String cor, String tipo) {
		this.setCor(cor);
		this.setTipo(tipo);
	}
	
	public boolean comparar(Esp espcificacao){
		return false;
	}

}
