package com.mateusborja.javalogic.samples;

public class MainVeiculos {
	public static void main(String[] args) {

		Veiculos v1 = new Veiculos();
		Veiculos v2 = new Veiculos();
		Carros c1 = new Carros();
		Motos m1 = new Motos();
		Caminhoes cam1 = new Caminhoes();

		v1.setMarca("Punto");
		v1.setModelo("Fiat");
		v1.setPreco(30000);
		v1.setPlaca("JXT 90-00");

		v2.setMarca("Omega");
		v2.setModelo("Chevrolet");
		v2.setPlaca("JXT-9090");
		v2.setPreco(38000);
		v2.setPreco(16000);

		c1.setMarca("Gol");
		c1.setModelo("Volksvagem");
		c1.setPlaca("JPT 32-32");
		c1.setnLugares(6);
		c1.setPreco(36000);

		m1.setMarca("Suzuki");
		m1.setModelo("Kawasaki");
		m1.setPlaca("XJP 21-21");
		m1.setPreco(22000);

		cam1.setMarca("Bau");
		cam1.setModelo("Roice");
		cam1.setPlaca("PJP 21-21");
		cam1.setPreco(46000);

		v1.showVeiculos();
		System.out.println("\n");

		v2.showVeiculos();
		System.out.println("\n");

		c1.showVeiculos();
		System.out.println("\n");

		m1.showVeiculos();
		System.out.println("\n");

		cam1.showVeiculos();
		System.out.println("\n");

	}

}
