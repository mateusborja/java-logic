//java exercicio
package com.mateusborja.sc03_25.exerc02;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto_exerc02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double base = sc.nextDouble();
		double altura = sc.nextDouble();

		double area = base * altura;
		double perimetro = 2.0 * (base + altura); // multiplicacao tem precedencia em relacao a soma, feita primeiro
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)); // ( base * base + altura * altura)

		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);

		sc.close();

	}

}
