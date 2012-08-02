package test.traditional;

import java.util.List;

import core.traditional.Esp;
import core.traditional.Estoque;
import core.traditional.Flor;

public class TesteClassesEquivalencia {

	public static void main(String[] args) {

		Estoque e = new Estoque();

		e.cadastrarFlor(new Flor("mm23", 6.50, new Esp("Ipe", "Amarelo")));
		e.cadastrarFlor(new Flor("mm29", 6.30, new Esp("Ipe", "Amarelo")));
		e.cadastrarFlor(new Flor("mm26", 6.80, new Esp("Ipe", "Rosa")));
		e.cadastrarFlor(new Flor("mm23", 10.00, new Esp("Orquidea", "Amarela")));

		// tipo nao existe
		System.out.println("(Rosa, Amarelo, Não encontrado)");

		List floresEncontradas1 = e.buscar(new Esp("Rosa", "Amarelo"));

		if (!floresEncontradas1.isEmpty()) {
			System.out.println("Numero de flores encontradas: "
					+ floresEncontradas1.size());
			for (Object i : floresEncontradas1) {
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

		System.out.println("***FIM DO TESTE***");
		System.out.println("");

		// cor nao existe
		System.out.println("(Ipe, Roxo, Não encontrado)");

		List floresEncontradas2 = e.buscar(new Esp("Ipe", "Roxo"));

		if (!floresEncontradas2.isEmpty()) {
			System.out.println("Numero de flores encontradas: "
					+ floresEncontradas2.size());
			for (Object i : floresEncontradas2) {
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

		System.out.println("***FIM DO TESTE***");
		System.out.println("");

		// tipo e cor nao existem
		System.out.println("(Rosa, Roxo, Não encontrado)");

		List floresEncontradas3 = e.buscar(new Esp("Rosa", "Roxo"));

		if (!floresEncontradas3.isEmpty()) {
			System.out.println("Numero de flores encontradas: "
					+ floresEncontradas3.size());
			for (Object i : floresEncontradas3) {
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

		System.out.println("***FIM DO TESTE***");
		System.out.println("");

		// tipo e cor existentes em uma flor
		System.out.println("(Ipe, Rosa, 1 flor encontrada)");

		List floresEncontradas4 = e.buscar(new Esp("Ipe", "Rosa"));

		if (!floresEncontradas4.isEmpty()) {
			System.out.println("Numero de flores encontradas: "
					+ floresEncontradas4.size());
			for (Object i : floresEncontradas4) {
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

		System.out.println("***FIM DO TESTE***");
		System.out.println("");

		// tipo e cor existentes em mais de uma flor
		System.out.println("(Ipe, Amarelo, 2 flores encontradas)");

		List floresEncontradas5 = e.buscar(new Esp("Ipe", "Amarelo"));

		if (!floresEncontradas5.isEmpty()) {
			System.out.println("Numero de flores encontradas: "
					+ floresEncontradas5.size());
			for (Object i : floresEncontradas5) {
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

		System.out.println("***FIM DO TESTE***");
		System.out.println("");

	}

}
