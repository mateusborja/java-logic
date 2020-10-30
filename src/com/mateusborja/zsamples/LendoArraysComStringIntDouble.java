//java array com for e if
package com.mateusborja.zsamples;

import java.util.Locale;
import java.util.Scanner;

public class LendoArraysComStringIntDouble {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("qtde de pessoas: ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		System.out.println("digite nome, idade e altura das " + n + " pessoas.");
		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("[nome: %s], [idade: %d anos], [altura: %.2f m]%n", nome[i], idade[i], altura[i]);
		}

		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += altura[i];
		}

		System.out.println();
		double media = (double) soma / n;
		System.out.printf("media das alturas: %.2f m", media);

		int ct = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 30) {
				ct++;
			}
		}

		System.out.println();
		double porcetagem = (double) ct * 100 / n;
		System.out.printf("percentual com menos de 30: %.2f%%.%n", porcetagem);
		sc.close();

	}

}
