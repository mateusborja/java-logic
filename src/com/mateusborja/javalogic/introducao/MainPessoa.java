// inheritance
package com.mateusborja.javalogic.introducao;

public class MainPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joao Honório", 65);
		Pessoa p2 = new Pessoa();

		p2.setNome("Ledinha Honório");
		p2.setIdade(75);

		p1.mostrar();
		System.out.println(p1.getNome() + ", " + p1.getIdade() + " anos\n");

		p2.mostrar();
		System.out.println(p2.getNome() + ", " + p2.getIdade() + " anos");
		

	}

}
