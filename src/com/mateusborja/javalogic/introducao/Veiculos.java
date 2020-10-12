//study java oo
package com.mateusborja.javalogic.introducao;

public class Veiculos {
	
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
	
	public void showCarros() {
		System.out.println("Dados do Carro: \n");
		System.out.println("Marca do Carro: " + marca);
		System.out.println("Modelo do Carro: " + modelo);
		System.out.println("Matricula do Carro: " + matricula);
		System.out.println("Placa do Carro: " + placa);
		System.out.println("Pre�o: " + preco + "\n");
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
