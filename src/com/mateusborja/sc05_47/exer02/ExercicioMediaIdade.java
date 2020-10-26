//java med
package com.mateusborja.sc05_47.exer02;

import java.util.Scanner;

public class ExercicioMediaIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int numerosDigitados = 0;

		while (idade >= 0) {

			soma = soma + idade; // soma +=idade;
			numerosDigitados = numerosDigitados + 1;
			idade = sc.nextInt();

		}

		if (numerosDigitados > 0) {

			double media = (double) soma / numerosDigitados;
			System.out.printf("A media das idades é: %.2f%n", media);

		} else {
			System.out.println("Impossivel calcular");

		}

		sc.close();
	}

}
