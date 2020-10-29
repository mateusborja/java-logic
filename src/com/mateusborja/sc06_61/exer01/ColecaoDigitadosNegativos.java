//java array numeros digitados de uma colecao
package com.mateusborja.sc06_61.exer01;

import java.util.Scanner;

public class ColecaoDigitadosNegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de Vetores da Coleção:");
		int n = sc.nextInt();

		int[] vet = new int[n];

		System.out.println("Digite os Vetores da Coleção:");

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();

		}

		System.out.println("");
		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.print(vet[i] + ", ");
			}

		}

		sc.close();

	}

}
