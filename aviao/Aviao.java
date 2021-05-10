package exercicio.aviao;

public class Aviao {

	private String modelo;
	private int velocidade;
	private int distanciaKM;
	private String qtdLugraes;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getDistanciaKM() {
		return distanciaKM;
	}

	public void setDistanciaKM(int distanciaKM) {
		this.distanciaKM = distanciaKM;
	}

	public String getQtdLugraes() {
		return qtdLugraes;
	}

	public void setQtdLugraes(String qtdLugraes) {
		this.qtdLugraes = qtdLugraes;
	}

	void checarCombustivel() {

	}

	void decolar() {

	}

	void pousar() {

	}
	
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
}
