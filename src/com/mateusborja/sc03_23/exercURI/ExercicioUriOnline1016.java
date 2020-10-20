//java distancia km/h
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1016 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, tempo;

		n = sc.nextInt();

		tempo = 2 * n;

		System.out.printf("%d minutos%n", tempo);

		sc.close();

	}

}
