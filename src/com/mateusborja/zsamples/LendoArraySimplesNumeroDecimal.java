//java array simples de numero decimal
package com.mateusborja.zsamples;

import java.util.Locale;
import java.util.Scanner;

public class LendoArraySimplesNumeroDecimal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("qtde de elemtos no array: ");
		int n = sc.nextInt();

		double[] vet = new double[n];

		System.out.println("elementos no array: ");
		for (int i = 0; i < n; i++) { // lendo o array
			vet[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < n; i++) { // imprimindo o array
			System.out.printf("[ %.1f ] ", vet[i]);
		}

		sc.close();

	}

}
