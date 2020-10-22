package com.mateusborja.sc04_33.expressoeslogicas;

public class ExpressaoLogicaE {

	public static void main(String[] args) {

		int x = 5;

		if (x <= 20 && x == 10) {
			System.out.println("Condicao Verdadeira: (x <= 20 && x == 10) ");

		} else
			System.out.println("Condicao Falsa: (x <= 20 && x == 10) ");

		if (x > 0 && x != 3) {
			System.out.println("Condicao Verdadeira: (x > 0 && x != 3) ");

		} else
			System.out.println("Condicao Falsa: (x > 0 && x != 3) ");

		if (x <= 20 && x == 10 && x != 3) {
			System.out.println("Condicao Verdadeira: (x <=20 && x == 10 && x !=3) ");

		} else
			System.out.println("Condicao Falsa: (x <=20 && x == 10 && x!=3) ");

	}

}
