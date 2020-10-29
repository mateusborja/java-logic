package com.mateusborja.sc06_62.exer02;

import java.util.Locale;
import java.util.Scanner;

public class ColecaoDigitadosSomaEMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("qtd de numeros do array: ");
		int n = sc.nextInt();

		double[] vet = new double[n];

		System.out.println("numeros do array: ");
		for (int i = 0; i < n; i++) { // ira ler o vetor
			vet[i] = sc.nextInt();

		}

		System.out.println();
		for (int i = 0; i < n; i++) { // imprimir os vetores
			System.out.print(vet[i] + " ");

		}

		System.out.println();
		double soma = 0;
		for (int i = 0; i < n; i++) { // ira somar os vetores
			soma = soma + vet[i];

		}
		System.out.printf("Soma é: %.2f%n", soma);

		double media = soma / n;
		System.out.printf("A media é: %.2f%n", media);

		sc.close();
	}

}
