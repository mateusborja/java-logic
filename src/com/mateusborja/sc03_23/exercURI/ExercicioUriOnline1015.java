//java uri 1015
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1015 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X;
		double Y, consumoMedio;

		X = sc.nextInt(); // distancia
		Y = sc.nextDouble(); // combustivel gasto

		consumoMedio = X / Y;

		System.out.printf("%.3f km/l%n", consumoMedio);

		sc.close();

	}

}
