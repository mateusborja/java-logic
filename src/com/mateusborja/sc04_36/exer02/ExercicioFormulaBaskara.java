// formula de Barkara
/*
 * A, B, C sao os coeficientes da eq. do segundo grau
 * Delta nao pode ser negativo
 * A nao pode ser zero
 */
package com.mateusborja.sc04_36.exer02;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFormulaBaskara {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, delta;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		delta = B * B - 4.0 * A * C;

		if (A == 0 || delta < 0) {
			System.out.println("Impossivel Calcular");
		} else {
			double r1 = (-B + Math.sqrt(delta)) / (2 * A);
			double r2 = (-B - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f%nR2 = %.5f%n", r1, r2);
		}

		sc.close();

	}

}
