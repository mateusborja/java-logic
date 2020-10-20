//java uri online
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo1, codigo2, quantidade1, quantidade2;
		double preco1, preco2, valorPago;

		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		preco1 = sc.nextDouble();
		;

		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		preco2 = sc.nextDouble();

		valorPago = preco1 * quantidade1 + preco2 * quantidade2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

		sc.close();

	}

}
