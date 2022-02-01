package com.valdomiro.curso.java.basico;
class Televisor {

	Integer canal = 150;
	Integer volume = 20;

	void mudarCanal(Integer novoCanal) {
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal � tamb�m o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}
	
	void mudarVolume(Integer novoVolume) {
		if (novoVolume.equals(novoVolume)) {
			System.out.println("Novo volume � tamb�m o volume atual.");
		} else {
			volume = Integer.valueOf(novoVolume);
			System.out.println("Volume alterado para " + volume);
		}
	}
	
	// Estamos aproveitando a classe Televisor para fazer nosso teste
	public static void main(String[] args) {
		Televisor tv = new Televisor();

		// N�o deveria mudar o volume e canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		// Deveria mudar o volume e canal
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	}

}