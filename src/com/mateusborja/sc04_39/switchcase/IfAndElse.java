//java if and else
package com.mateusborja.sc04_39.switchcase;

import java.util.Scanner;

public class IfAndElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero da semana: ");
		int x = sc.nextInt();

		String dia;

		if (x == 1) {
			dia = "Domingo";
			System.out.println("O dia da semana �: " + dia);
		} else if (x == 2) {
			dia = "Segunda-Feira";
			System.out.println("O dia da semana �: " + dia);

		} else if (x == 3) {
			dia = "Ter�a-Feira";
			System.out.println("O dia da semana �: " + dia);

		} else if (x == 4) {
			dia = "Quarta-Feira";
			System.out.println("O dia da semana �: " + dia);

		} else if (x == 5) {
			dia = "Quinta-Feira";
			System.out.println("O dia da semana �: " + dia);

		} else if (x == 6) {
			dia = "Sexta-Feira";
			System.out.println("O dia da semana �: " + dia);

		} else if (x == 7) {
			dia = "S�bado";
			System.out.println("O dia da semana �: " + dia);

		} else if (x >= 8) {
			dia = "Valor inv�lido";
			System.out.println(dia);

		} else {
			dia = "Valor inv�lido";
			System.out.println("O dia da semana �: " + dia);

		}

	}
}
