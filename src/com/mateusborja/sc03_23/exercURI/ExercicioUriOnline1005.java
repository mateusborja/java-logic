//java example URI online
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, A, B, media, soma;

		A = 3.5;
		B = 7.5;
		soma = 11;

		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();

		media = (nota1 * A + nota2 * B) / soma;
		System.out.printf("MEDIA = %.5f%n", media);

		sc.close();

	}

}
