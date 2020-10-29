//java array
package com.mateusborja.sc06_61.exer01;

import java.util.Scanner;

public class ColecaoDigitadosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qtd de Vetores");
		int n = sc.nextInt();

		int[] vet = new int[n];

		System.out.println("Números da Coleção: ");
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.println(vet[i]);
			}

		}

		sc.close();

	}

}
