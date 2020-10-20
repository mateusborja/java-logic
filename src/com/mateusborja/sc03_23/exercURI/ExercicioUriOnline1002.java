//java URI Online
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, R, pi = 3.14159;

		R = sc.nextDouble();

		A = pi * R * R;

		System.out.printf("A=%.4f%n", A);

		sc.close();

	}

}
