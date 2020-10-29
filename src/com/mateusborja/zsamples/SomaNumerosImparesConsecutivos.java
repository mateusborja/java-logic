//java if else andfor
package com.mateusborja.zsamples;

import java.util.Scanner;

/*
 * soma do intervalo de 
 * dois numeros consecutivos
 */
public class SomaNumerosImparesConsecutivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois numeros consecutivos: ");
		System.out.println("");

		int x = sc.nextInt();
		int y = sc.nextInt();

		int min, max, soma = 0;

		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}

		// encontrando o intervalo
		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}

		}

		System.out.println("A soma de impares nesse intervalo é: " + soma);
		sc.close();

	}

}
