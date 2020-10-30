//java array with for and if 
package com.mateusborja.zsamples;

import java.util.Scanner;

public class LendoArrayNumerosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("qtd de numeros no array: ");
		int n = sc.nextInt();

		double[] vet = new double[n];

		System.out.println("numeros do array: ");
		for (int i = 0; i < n; i++) { //lendo o array
			vet[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.print("pares do array: ");
		for (int i = 0; i < n; i++) { //lendo para imprimir
			if (vet[i] % 2 == 0) { // condicao de numero par
				System.out.printf("[ %.1f ]", vet[i]); // imprimindo os numeros pares
			}

		}

		sc.close();

	}

}
