package cataFrutas;

public class Frutas extends Elemento {
	private String tipo;
	private boolean bichada;

	public Frutas(int posX, int posY, String tipo, boolean bichada) {
		super(posX, posY);
		this.tipo = tipo;
		this.bichada = bichada;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean getBichada() {
		return bichada;
	}

	public void interagir() {
		// O que acontece ao interagir com a fruta
	}

}