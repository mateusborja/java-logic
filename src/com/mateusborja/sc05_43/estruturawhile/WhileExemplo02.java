//java while conversao celsiu fahrenheit
package com.mateusborja.sc05_43.estruturawhile;

import java.util.Locale;
import java.util.Scanner;

public class WhileExemplo02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a Temperatura em Celsius: ");
		double celsius = sc.nextDouble();

		double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit é : %.1f F%n", fahrenheit);

		System.out.print("Deseja repetir? (s/n)? ");
		char repetir = sc.next().charAt(0);

		while (repetir != 'n') {

			System.out.print("Digite a Temperatura em Celsius: ");
			celsius = sc.nextDouble();

			fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit é : %.1f F%n", fahrenheit);

			System.out.print("Deseja repetir? (s/n)? ");
			repetir = sc.next().charAt(0);

		}

	}

}
