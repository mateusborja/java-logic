//java areas uri online
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1012 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, pi = 3.14159, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		areaTriangulo = A * C / 2;
		areaCirculo = pi * C * C;
		areaTrapezio = (A + B) * C / 2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

	}

}
