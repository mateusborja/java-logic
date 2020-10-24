//java if else example
package com.mateusborja.sc04_35.exer01;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido35 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, notaFinal;

		System.out.println("Digite a Primeira Nota:");
		nota1 = sc.nextDouble();

		System.out.println("Digite a Segunda Nota:");
		nota2 = sc.nextDouble();

		notaFinal = nota1 + nota2;
		System.out.printf("\nNota Final = %.1f%n", notaFinal);

		if (notaFinal < 60.00) {
			System.out.println("ALUNO => REPROVADO");
			System.out.println(">>>>> VOCE DEVE ESTUDAR MAIS <<<<<");

		} else {
			System.out.println("ALUNO => APROVADO");
			System.out.println(">>>>> PARABENS <<<<<");

		}

		sc.close();

	}

}
