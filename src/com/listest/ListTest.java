package com.listest;

import org.junit.Assert;
import org.junit.Test;

import com.list.List;
import com.list.implementations.Nil;

public class ListTest {

	@Test
	public void DeveAdicionarElementoNoComecoDaLista() {
		List<Integer> lista = new Nil<Integer>().adicionaNoComeco(1)
				.adicionaNoComeco(2);

		Assert.assertEquals(new Integer(2), lista.pegaPosicao(0));
	}
}
