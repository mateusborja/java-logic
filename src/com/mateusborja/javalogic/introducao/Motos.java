package com.mateusborja.javalogic.introducao;

public class Motos extends Veiculos {

	private int peso;
	

	public Motos(String marca, String modelo, String matricula, String placa, int peso) {
		super(marca, modelo, matricula, placa, peso);
		this.peso = peso;

	}

	public Motos() {

	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	public void showVeiculos() {
		System.out.println("Dados do Carro:");
		super.showVeiculos();
		System.out.println("Peso do Veículo: " + peso+ "\n");
	}
	
		

}
