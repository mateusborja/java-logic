//study java oo
package com.mateusborja.javalogic.introducao;

public class Veiculos {
	
	private String marca;
	private String modelo;
	private String matricula;
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
	
	
	
	public Veiculos(String marca, String modelo, String matricula, int preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.preco = preco;
	}
	
	
	public Veiculos() {
		marca = "Desconhecida";
		modelo = "Desconhecido";
		matricula = "PPP-10290-000";
		preco = 0;
				
	}
	
	public void showCarros() {
		System.out.println("Dados do Carro: \n");
		System.out.println("Marca do Carro: " + marca);
		System.out.println("Modelo do Carro: " + modelo);
		System.out.println("Matricula do Carro: " + matricula);
		System.out.println("Preço: " + preco + "\n");
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


	public int getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	

}
