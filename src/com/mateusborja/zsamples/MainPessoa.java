// inheritance
package com.mateusborja.zsamples;

public class MainPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joao Honório", 65);
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.setNome("Joao Honório");
		p1.setIdade(85);

		p2.setNome("Ledinha Honório");
		p2.setIdade(75);
		
		p3.setNome("Ligia Honorio");
		p3.setIdade(95);

		p1.mostrar();
		System.out.println(p1.getNome() + ", " + p1.getIdade() + " anos\n");

		p2.mostrar();
		System.out.println(p2.getNome() + ", " + p2.getIdade() + " anos");
		
		System.out.println("\n" + p3.toString());
		

	}

}
