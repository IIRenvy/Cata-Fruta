package cataFrutas;

import java.util.Arrays;

public class Floresta {
	private int dimensao;
	private Elemento[][] terreno;

	public Floresta(int dimensao) {
		this.dimensao = dimensao;
		this.terreno = new Elemento[terreno][terreno];
	}

	private void criarTerreno() {
		// Cria o terreno, adicionando os elementos definidos
	}

	public Elemento getElemento(int x, int y) {
		return terreno[x][y];
	}

	public void setElemento(int x, int y, Elemento elemento) {
		terreno[x][y] = elemento;
	}

	public void mostrarTerreno() {
		// Mostra o terreno na tela
	}
}
