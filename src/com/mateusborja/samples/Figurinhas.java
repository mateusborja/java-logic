package com.mateusborja.samples;

public class Figurinhas {
	
	String nome;
	int numFigurinhas;
	
	public void receber (int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}
	
	
	public void doar(int numFigurinhas, Figurinhas f) {
		f.numFigurinhas -= numFigurinhas;
		
	}
	
	
	public String chamarNome(String nome) {
		return this.nome = nome;
	}
	
	public String toString() {
		return "Nome: => " + nome + "\nTotal de Figurinhas: => " + numFigurinhas;
	}
	
	

}
