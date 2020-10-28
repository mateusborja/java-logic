//java if else and for
package com.mateusborja.zsamples;

public class NumerosPrimos {

	public static boolean numeroPrimo(int numero) {

		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {

		for (int a = 0; a <= 100; a++) {
			if (a % 2 == 0)
				System.out.println("numeros pares: " + a);

		}

		// numeros primos
		System.out.println("");

		for (int i = 2; i <= 100; i++) {
			if (numeroPrimo(i))
				System.out.println("numeros primos: " + i);

		}

	}

}
