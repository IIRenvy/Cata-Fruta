package cataFrutas;

import java.util.List;

public class Jogador extends Elemento {
	private String nome;
	private int pontosDeMovimento;
	private List<Frutas> mochila;

	// Construtor da classe Jogadores
	public Jogador(int posX, int posY, String nome) {
		super(posX, posY);
		this.nome = nome;
	}

	public void movimentar(int nPosX, int nPosY) {
		// Movimentar o jogador
	}

	public void recolherFruta() {
		// Se houver, recolhe a fruta no pé do jogador
	}

	public void comerFruta() {
		// Come uma fruta
	}

	public void empurrar() {
		/*
		 * Caso o movimento de um jogador seja de encontro com outro jogador, esse
		 * metodo será chamado
		 */
		// Aqui dentro também será calculada a força do jogador
	}

	public String getNome() {
		return nome;
	}

	public int getPontosDeMovimento() {
		return pontosDeMovimento;
	}

	public void setPontosDeMovimento(int pontosDeMovimento) {
		this.pontosDeMovimento = pontosDeMovimento;
	}

}
