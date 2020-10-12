package com.mateusborja.javalogic.introducao;

public class MainVeiculos {
	public static void main(String[] args) {
		
		Veiculos c1 = new Veiculos("Fiat", "Punto", "PPP-10290-000", 35000);
		
		Veiculos c2 = new Veiculos();
		Veiculos c3 = new Veiculos("Omega");
		
		c1.setPreco(25000);
		c3.setPreco(38000);
		
		c1.showCarros();
		
		
	}

}
