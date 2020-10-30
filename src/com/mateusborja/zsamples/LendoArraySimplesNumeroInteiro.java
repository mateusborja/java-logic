//java array simples de numero inteiro
package com.mateusborja.zsamples;

import java.util.Scanner;

public class LendoArraySimplesNumeroInteiro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("qtd de elementos no array: ");
		int n = sc.nextInt(); // variavel que define a qtde de elementos no array

		int[] myArr = new int[n];

		System.out.println("digite os elementos do array: ");
		for (int i = 0; i < n; i++) { // ler o array
			myArr[i] = sc.nextInt();
		}

		System.out.println(); //contatenando com espaço de quebra de linha
		for (int i = 0; i < n; i++) { // imprimir o array lido
			System.out.printf("[ %d ] ", myArr[i]);
		}

		sc.close();

	}

}
