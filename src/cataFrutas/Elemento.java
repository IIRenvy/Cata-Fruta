package cataFrutas;

public class Elemento {
	public int posX;
	public int posY;

	// Construtos da classe elemento
	public Elemento(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosYElem() {
		return posY;
	}

	public void setPosicao(int x, int y) {
		// Escolhe a posição para que um objeto seja gerado
	}

	public void interagir() {
		// Responde ao metodo interagir do elemento que foi interagido pelo jogador
	}
}
