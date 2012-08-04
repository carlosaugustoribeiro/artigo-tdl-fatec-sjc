package test.tdl;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

import core.tdl.Esp;
import core.tdl.Estoque;
import core.tdl.Flor;

public class EstoqueTest {

	Flor flor1 = EasyMock.createMock(Flor.class);
	Flor flor2 = EasyMock.createMock(Flor.class);
	Esp especificacao1 = EasyMock.createMock(Esp.class);
	Esp especificacao2 = EasyMock.createMock(Esp.class);

	@Test
	public void criarEstoqueTest() {
		Estoque estoque = new Estoque();
		Assert.assertNotNull(estoque);
		Assert.assertNotNull(estoque.getListaFlores());
		Assert.assertEquals(0, estoque.getListaFlores().size());
	}

	@Test
	public void setEGetEstoqueTest() {
		Estoque estoque = new Estoque();
		List<Flor> lista = new ArrayList<Flor>();
		lista.add(this.flor1);
		estoque.setListaFlores(lista);
		Assert.assertEquals(1, estoque.getListaFlores().size());
		Assert.assertEquals(this.flor1, estoque.getListaFlores().get(0));
	}

	@Test
	public void cadastrarFlor() {
		Estoque estoque = new Estoque();
		estoque.cadastrarFlor(this.flor2);
		Assert.assertEquals(1, estoque.getListaFlores().size());
		Assert.assertEquals(this.flor2, estoque.getListaFlores().get(0));
	}

	@Test
	public void buscarFlorENaoEncontra() {
		Estoque estoque = new Estoque();

		EasyMock.expect(this.flor1.getEspecificacao()).andReturn(
				this.especificacao1);
		EasyMock.expect(this.flor2.getEspecificacao()).andReturn(
				this.especificacao2);
		EasyMock.expect(this.especificacao1.comparar(this.especificacao2))
				.andReturn(false);
		EasyMock.replay(this.flor1, this.flor2, this.especificacao1,
				this.especificacao2);

		estoque.cadastrarFlor(flor1);
		List<Flor> lista = estoque.buscar(this.flor2.getEspecificacao());
		Assert.assertEquals(0, lista.size());
	}

	@Test
	public void buscarFlorEEncontra() {
		Estoque estoque = new Estoque();

		EasyMock.expect(this.flor1.getEspecificacao()).andReturn(
				this.especificacao1);
		EasyMock.expect(this.flor2.getEspecificacao()).andReturn(
				this.especificacao2);
		EasyMock.expect(this.especificacao1.comparar(this.especificacao2))
				.andReturn(true);
		EasyMock.replay(this.flor1, this.flor2, this.especificacao1,
				this.especificacao2);

		estoque.cadastrarFlor(flor1);
		List<Flor> lista = estoque.buscar(this.flor2.getEspecificacao());
		Assert.assertEquals(1, lista.size());
	}
}
