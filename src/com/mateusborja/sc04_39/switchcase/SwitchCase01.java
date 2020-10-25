//java switch
package com.mateusborja.sc04_39.switchcase;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero da semana: ");
		int x = sc.nextInt();
		String dia;

		switch (x) {

		case 1:
			dia = "Domingo";
			System.out.println("O dia da semana é => " + dia);
			break;

		case 2:
			dia = "Segunda-Feira";
			System.out.println("O dia da semana é => " + dia);
			break;

		case 3:
			dia = "Terça-Feira";
			System.out.println("O dia da semana é => " + dia);
			break;

		case 4:
			dia = "Quarta-Feira";
			System.out.println("O dia da semana é => " + dia);
			break;

		case 5:
			dia = "Quinta-Feira";
			System.out.println("O dia da semana é => " + dia);
			break;

		case 6:
			dia = "Sexta-Feira";
			System.out.println("O dia da semana é => " + dia);
			break;

		case 7:
			dia = "Sábado";
			System.out.println("O dia da semana é => " + dia);
			break;

		default:
			dia = "Valor inválido";
			System.out.println(dia);
			break;
		}


	}

}
