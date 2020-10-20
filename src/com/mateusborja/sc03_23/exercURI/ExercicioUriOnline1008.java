package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int funcionarios, horasTrabalhadas;
		double valorHora, salario;

		funcionarios = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();

		salario = valorHora * horasTrabalhadas;

		System.out.println("NUMBER = " + funcionarios);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}
}
