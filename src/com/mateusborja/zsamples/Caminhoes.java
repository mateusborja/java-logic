package com.mateusborja.zsamples;

public class Caminhoes extends Veiculos {
	
	private int cilindrada;
	
	public Caminhoes(String marca, String modelo, String matricula, String placa, int cilindrada) {
		super (marca, modelo, matricula, placa);
		this.cilindrada = cilindrada;
	}
	
	
	
	public Caminhoes() {
		
	}



	public int getCilindrada() {
		return cilindrada;
	}



	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	public void showVeiculos() {
		System.out.println("Dados do Caminhão:");
		super.showVeiculos();
		System.out.println("Cilindrada do Veículo: " + cilindrada);
	}
	

}
