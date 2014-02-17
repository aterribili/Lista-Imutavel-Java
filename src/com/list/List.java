package com.list;

public interface List<T> {
	T cabeca();

	List<T> cauda();

	List<T> adicionaNoComeco(T elemento);

	T pegaPosicao(int position);

	List<T> removePrimeiraPosicao();

}
