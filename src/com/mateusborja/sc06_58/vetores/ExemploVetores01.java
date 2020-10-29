//indexando vetores
package com.mateusborja.sc06_58.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetores01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();

		}

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f%n", vetor[i]);

		}

		sc.close();

	}

}
