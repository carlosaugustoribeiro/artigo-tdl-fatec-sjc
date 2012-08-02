package core.traditional;

import java.util.List;
import java.util.LinkedList;

public class Estoque {
	
	private List<Flor> listaFlores;
	
	public Estoque(){
		listaFlores = new LinkedList<Flor>();
	}
	
	public void cadastrarFlor(Flor f){
		listaFlores.add(f);
	}
	
	public List<Flor> buscar(Esp espCliente){
		List<Flor> encontradas = new LinkedList<Flor>();
		for(Object i: listaFlores){
			Flor florEstoque = (Flor)i;
			if(florEstoque.getE().comparar(espCliente)) encontradas.add(florEstoque);
		}
		return encontradas;
	}

}
