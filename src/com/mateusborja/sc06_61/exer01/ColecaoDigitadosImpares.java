package com.mateusborja.sc06_61.exer01;

import java.util.Scanner;

public class ColecaoDigitadosImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qtd de números do Vetor: ");
		int n = sc.nextInt();

		int[] vet = new int[n];

		System.out.println("números da coleção: ");
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();

		}

		System.out.print("numeros impares:");
		int soma = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 != 0) {
				System.out.print(" "+ vet[i]);
				soma += vet[i];
			}

		}
		System.out.println();
		System.out.print("soma dos impares:  " + soma);

		sc.close();

	}

}
