//study java oo
package com.mateusborja.samples;

public class Veiculos  {
	
	private String marca;
	private String modelo;
	private String matricula;
	private String placa;
	private int preco;
	
	
	
	public Veiculos(String marca) {
		this.marca = marca;

	}
	
	public Veiculos(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;

	}
	
	public Veiculos(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;

	}
	
	public Veiculos(String marca, String modelo, String matricula, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.placa = placa;

	}
	
	public Veiculos(String marca, String modelo, String matricula, String placa, int preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.placa = placa;
		this.preco = preco;
	}
	
	
	public Veiculos() {
		marca = "Desconhecida";
		modelo = "Desconhecido";
		matricula = "PPP-10290-000";
		placa = "JXP-10290";
		preco = 0;
				
	}

	public void showVeiculos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Matricula: " + matricula);
		System.out.println("Placa: " + placa);
		System.out.println("Preço: " + preco);
	}
	

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	

}
