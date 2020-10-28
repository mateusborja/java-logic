/*
    Um numero e considerado par quando o resto de sua divisao e igual == a zero;
    java if else - numeros pares - soma dos pares em um intervalo
 */
package com.mateusborja.zsamples;

import java.util.Arrays;
import java.util.List;

public class SomaNumerosPares {

	public static void main(String[] args) {

		Integer[] pares = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List listaPares = Arrays.asList(pares);

		System.out.println(listaPares);

		for (int i = 0; i <= 12; i++) { // inicio = 0, condicao 0 a 20, incremento i + 1

			if (i % 2 == 0) { // condicao numero par
				int sum = i + i; // soma dos pares
				System.out.println("soma dos pares 0 a 12: " + i + " + " + i + " = " + sum); // impressao das 'somas'
			}

		}

	}

}
