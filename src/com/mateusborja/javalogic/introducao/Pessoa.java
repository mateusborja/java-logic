//java encapsulation and inheritance
package com.mateusborja.javalogic.introducao;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa() {
		
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	
	
	public void mostrar() {
		System.out.println("O nome e a idade são: =>");
	}
	
	public String toString() {
		return "O nome é: => " + nome + " e sua idade é: => " + idade;
	}


}
