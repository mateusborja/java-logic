//Tabuada
package com.mateusborja.zsamples;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Tabuada do Número?");
		int n = sc.nextInt();

		System.out.println("");
		for (int i = 1; i <= 10; i++) {
			int tabuada = i * n;
			System.out.println(i + " x " + n + " = " + tabuada);

		}
		
		sc.close();

	}

}
