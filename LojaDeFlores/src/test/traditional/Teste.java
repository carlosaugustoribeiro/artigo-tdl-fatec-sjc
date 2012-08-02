package test.traditional;

import java.util.List;

import core.traditional.Esp;
import core.traditional.Estoque;
import core.traditional.Flor;

public class Teste {

	public static void main(String[] args) {

		Estoque e = new Estoque();

		e.cadastrarFlor(new Flor("mm23", 6.50, new Esp("Ipe", "Amarelo")));
		e.cadastrarFlor(new Flor("mm29", 6.30, new Esp("Ipe", "Amarelo")));
		e.cadastrarFlor(new Flor("mm26", 6.80, new Esp("Ipe", "Rosa")));
		e.cadastrarFlor(new Flor("mm23", 10.00, new Esp("Orquidea", "Amarela")));

		List floresEncontradas = e.buscar(new Esp("Ipe", "Amarelo"));

		if (!floresEncontradas.isEmpty()) {
			for (Object i : floresEncontradas) {
				Flor florEncontrada = (Flor) i;
				System.out.println("Encontramos a flor com id: "
						+ florEncontrada.getId());
				System.out.println("Ela custa: " + florEncontrada.getPreco());
				System.out.println("Tipo: " + florEncontrada.getE().getTipo());
				System.out.println("Cor da Flor: "
						+ florEncontrada.getE().getCor());
				System.out.println("---------");
			}
		} else {
			System.out.println("Nenhuma flor encontrada");
		}

	}

}
