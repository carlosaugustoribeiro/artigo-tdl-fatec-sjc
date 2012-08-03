package core.tdl;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<Flor> listaFlores = new ArrayList<Flor>();

	public Estoque() {
	}

	public List<Flor> getListaFlores() {
		return listaFlores;
	}

	public void setListaFlores(List<Flor> listaFlores) {
		this.listaFlores = listaFlores;
	}

	public void cadastrarFlor(Flor flor) {

	}

	public List<Flor> buscar(Esp especificao) {
		return null;
	}
}
