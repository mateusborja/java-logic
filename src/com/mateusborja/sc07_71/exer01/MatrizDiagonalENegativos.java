//array bidimensional
package com.mateusborja.sc07_71.exer01;

import java.util.Scanner;

public class MatrizDiagonalENegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("tell me row and coluns:");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) { // ler a matriz
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Diagonal Principal: ");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();
		int ct = 0; // variavel que contara numeros negativos
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) { // condicao de numero negativos
					ct++;
				}
			}
		}

		System.out.print("Qtde de negativos: " + ct);

		sc.close();
	}

}
