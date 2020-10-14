//java inheritance 
package com.mateusborja.javalogic.samples;

public class Carros extends Veiculos {
	
	private int nLugares;
	
	
	public Carros(String marca, String modelo, String matricula, String placa, int nLugares) {
		super(marca, modelo, matricula, placa);
		this.nLugares = nLugares;
		
	}
	
	public Carros() {
		
	}


	public int getnLugares() {
		return nLugares;
	}


	public void setnLugares(int nLugares) {
		this.nLugares = nLugares;
	}
	
	
	public void showVeiculos() {
		System.out.println("Dados do Carro:");
		super.showVeiculos();
		System.out.println("Lugares do Veículo: " + nLugares + "\n");
	}
	
}
