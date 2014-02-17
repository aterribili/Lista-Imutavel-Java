package com.list.implementations;

import com.list.List;

public class No<T> implements List<T> {

	private final T cabeca;
	private final List<T> cauda;

	public No(T cabeca, List<T> cauda) {
		this.cabeca = cabeca;
		this.cauda = cauda;
	}

	@Override
	public T cabeca() {
		return cabeca;
	}

	@Override
	public List<T> cauda() {
		return cauda;
	}

	@Override
	public List<T> adicionaNoComeco(T elemento) {
		return new No<T>(elemento, this);
	}

	@Override
	public T pegaPosicao(int position) {
		if (position == 0)
			return cabeca();

		return cauda.pegaPosicao(position - 1);
	}

	@Override
	public List<T> removePrimeiraPosicao() {
		return cauda();
	}

}
