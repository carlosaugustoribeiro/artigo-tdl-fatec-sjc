package core.traditional;


public class Esp {
	
	private String tipo;
	private String cor;
	
	public Esp(String t, String c){
		tipo = t;
		cor = c;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public String getCor(){
		return cor;
	}
	
	public boolean comparar(Esp espCli){
		if(!tipo.equals(espCli.tipo)) return false;
		if(!cor.equals(espCli.cor)) return false;
		return true;
	}

}
