package com.list.implementations;

import com.list.List;

public class Nil<T> implements List<T> {

	@Override
	public T cabeca() {
		throw new RuntimeException("Lista Vazia");
	}

	@Override
	public List<T> cauda() {
		throw new RuntimeException("Lista Vazia");
	}

	@Override
	public List<T> adicionaNoComeco(T elemento) {
		return new No<T>(elemento, this);
	}

	@Override
	public T pegaPosicao(int position) {
		throw new RuntimeException("A lista não possui elementos");
	}

	@Override
	public List<T> removePrimeiraPosicao() {
		throw new RuntimeException(
				"Impossível remover elementos de uma lista vazia");
	}
}
