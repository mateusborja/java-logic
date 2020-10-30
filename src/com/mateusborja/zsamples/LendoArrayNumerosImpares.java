//java array with for and if
package com.mateusborja.zsamples;

import java.util.Scanner;

public class LendoArrayNumerosImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("qtd de numeros no array: ");
		int n = sc.nextInt();

		System.out.println("numeros do array: ");
		int[] myArr = new int[n];

		for (int i = 0; i < n; i++) { // lendo array
			myArr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("numeros impares do array:");

		for (int i = 0; i < n; i++) {
			if (myArr[i] % 2 != 0) { // condicao de numeros impares
				System.out.printf("[ %d ] ", myArr[i]);
			}
		}

		sc.close();

	}

}
