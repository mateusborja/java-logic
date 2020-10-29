//java for: (String name : names);
package com.mateusborja.sc06_64.estruturaparacada;

import java.util.Scanner;

public class EstruturaParaCadaOpcional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos nome: ");
		int n = sc.nextInt();

		String[] nomes = new String[n];

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();

		}

		System.out.println("\nNomes Digitados: ");

		for (String nome : nomes) {
			System.out.println(nome);
		}

		sc.close();

	}

}
