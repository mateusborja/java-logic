/*
 * soma das alturas com a media e 
 * quantas pessoas tem menos de 16 anos // n - 100% / cont - x%?
 */
package com.mateusborja.sc06_63.exer03;

import java.util.Locale;
import java.util.Scanner;

public class ArrayNomeIdadeAltura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) { // lendo o array com estrutura de repetição
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();

		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) { // ler todas as alturas e achar a soma
			soma += alturas[i];
		}

		double media = (double) soma / n; // ira calcular a media
		System.out.printf("Altura média: %.2f%n", media); //

		int ct = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) { // condicao de idades menos que 16
				ct++; // ct = ct + 1;
			}
		}

		double porcentagem = (double) ct * 100 / n;
		System.out.printf("Pessoa com menos de 16 anos: %.1f%%%n", porcentagem);

		sc.close();
	}

}
