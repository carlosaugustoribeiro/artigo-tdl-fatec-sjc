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
		Esp especializacao = new Esp("azul", "tipo");
		Assert.assertEquals("azul", especializacao.getCor());
		Assert.assertEquals("tipo", especializacao.getTipo());
	}

	@Test
	public void setEGetAtributosEspTest() {
		Esp especializacao = new Esp("azul", "tipo");
		especializacao.setCor("vermelho");
		especializacao.setTipo("tipo2");
		Assert.assertEquals("vermelho", especializacao.getCor());
		Assert.assertEquals("tipo2", especializacao.getTipo());
	}

	@Test
	public void compararRetornaFalse() {
		Esp especializacao1 = new Esp();
		Esp especializacao2 = new Esp();

		especializacao1.setCor("azul");
		especializacao1.setTipo("tipo1");
		especializacao2.setCor("vermelho");
		especializacao2.setTipo("tipo1");

		Assert.assertFalse(especializacao1.comparar(especializacao2));
	}

	@Test
	public void compararRetornaTrue() {
		Esp especializacao1 = new Esp();
		Esp especializacao2 = new Esp();

		especializacao1.setCor("azul");
		especializacao1.setTipo("tipo1");
		especializacao2.setCor("azul");
		especializacao2.setTipo("tipo1");

		Assert.assertTrue(especializacao1.comparar(especializacao2));
	}
}
