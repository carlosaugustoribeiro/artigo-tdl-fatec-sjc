package test.tdl;

import junit.framework.Assert;

import org.junit.Test;

import core.tdl.Esp;

public class EspTest {

	@Test
	public void criarEspComConstrutotVazioTest() {
		Esp especializacao = new Esp();
		Assert.assertNotNull(especializacao);
		Assert.assertNull(especializacao.getCor());
		Assert.assertNull(especializacao.getTipo());
	}

	@Test
	public void criarEspComConstrutorCompletoTeste() {
		Esp especializacao = new Esp("azul","tipo");
		Assert.assertEquals("azul", especializacao.getCor());
		Assert.assertEquals("tipo", especializacao.getTipo());
	}

	@Test
	public void setEGetAtributosEspTest() {
		Esp especializacao = new Esp("azul","tipo");
		especializacao.setCor("vermelho");
		especializacao.setTipo("tipo2");
		Assert.assertEquals("vermelho", especializacao.getCor());
		Assert.assertEquals("tipo2", especializacao.getTipo());
	}

}
