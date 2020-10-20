//java exercicio01
package com.mateusborja.sc03_21.exerc01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		//Locale.setDefault(Locale.US); // set default US input type
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, metroQuadrado;
		double area;
		double precoTotal;

		System.out.println("Digite o valor da Largura:");
		largura = sc.nextDouble();
		System.out.println("Digite o valor do Comprimento:");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado:");
		metroQuadrado = sc.nextDouble();

		area = largura * comprimento;
		precoTotal = area * metroQuadrado;

		System.out.printf("A area do terreno é: %.2f Metros%n", area);
		System.out.printf("Preço do terreno é: R$ %.2f%n", precoTotal);

		sc.close();

	}

}
