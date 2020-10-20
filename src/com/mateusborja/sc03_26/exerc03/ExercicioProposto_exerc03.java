//java media
package com.mateusborja.sc03_26.exerc03;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto_exerc03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome1 = sc.next();
		int idade1 = sc.nextInt();

		String nome2 = sc.next();
		int idade2 = sc.nextInt();

		double media = (double) (idade1 + idade2) / 2; // casting ou (idade1 + idade2) / 2.0

		System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

	}

}
