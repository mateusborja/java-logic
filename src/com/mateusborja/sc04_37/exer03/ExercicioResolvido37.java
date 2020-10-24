//java if else encadeamento
package com.mateusborja.sc04_37.exer03;

import java.util.Scanner;

public class ExercicioResolvido37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("Digite tres numeros Inteiros:");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("Menor é " + a);

		} else if (b < c) {
			System.out.println("Menor é " + b);
		} else {
			System.out.println("Menor é " + c);

		}

	}

}
