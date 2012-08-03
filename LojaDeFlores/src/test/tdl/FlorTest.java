package test.tdl;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

import core.tdl.Esp;
import core.tdl.Flor;

public class FlorTest {

	Esp especificacao = EasyMock.createMock(Esp.class);

	@Test
	public void criarFlorComConstrutorVazioTest() {
		Flor flor = new Flor();
		Assert.assertNotNull(flor);
		Assert.assertNull(flor.getId());
		Assert.assertEquals(0.0, flor.getPreco());
		Assert.assertNull(flor.getEspecificacao());
	}

	@Test
	public void criarFlorComConstrutorCompletoTest() {
		Flor flor = new Flor("1", 2, this.especificacao);
		Assert.assertEquals("1", flor.getId());
		Assert.assertEquals(2.0, flor.getPreco());
		Assert.assertEquals(this.especificacao, flor.getEspecificacao());
	}

	@Test
	public void setEGetAtributosFlorTest() {
		this.especificacao.setCor("vermelho");
		Flor flor = new Flor("2", 3, this.especificacao);

		EasyMock.expect(this.especificacao.getCor()).andReturn("azul").times(2);
		this.especificacao.setCor("azul");
		flor.setEspecificacao(this.especificacao);
		flor.setId("4");
		flor.setPreco(50);
		EasyMock.replay(this.especificacao);

		Assert.assertEquals("4", flor.getId());
		Assert.assertEquals(50.0, flor.getPreco());
		Assert.assertEquals(this.especificacao.getCor(), flor
				.getEspecificacao().getCor());
	}

}
