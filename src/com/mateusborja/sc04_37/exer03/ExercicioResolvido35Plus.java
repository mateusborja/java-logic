package com.mateusborja.sc04_37.exer03;

import java.util.Scanner;

public class ExercicioResolvido35Plus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("Digite três número inteiros: =>");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		// numeros iguais
		if (a == b && a == c) {
			System.out.printf("Voce digitou 3 valores iguais => %d %d %d%n", a, b, c);
		} else {

			// menor valor
			if (a < b && a < c) {
				System.out.println("O \"menor\" valor digitado é: => " + a);
			} else if (b < c) {
				System.out.println("O \"menor \" valor digitado é: => " + b);

			} else {
				System.out.println("O \"menor \" valor digitado é: => " + c);

			}

			// maior valor
			if (a > b && a > c) {
				System.out.println("E o \"maior \" valor digitado é: => " + a);
			} else if (b > c) {
				System.out.println("E o \"maior\" valor digitado é => " + b);
			} else {
				System.out.println("E o \"maior\" valor digitado é => " + c);

			}

		}

	}

}
