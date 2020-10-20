//java URI online 1006
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, A, B, C, media, soma;

		A = 2.0;
		B = 3.0;
		C = 5.0;
		soma = 10.0;

		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();

		media = (nota1 * A + nota2 * B + nota3 * C) / soma;
		System.out.printf("MEDIA = %.1f%n", media);

		sc.close();

	}

}
