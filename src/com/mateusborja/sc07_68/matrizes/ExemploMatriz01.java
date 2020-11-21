package com.mateusborja.sc07_68.matrizes;

import java.util.Scanner;

public class ExemploMatriz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("tell me rows: ");
		int M = sc.nextInt();
		System.out.print("tell me columns: ");
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		System.out.println("tell me numbers: ");
		for (int i = 0; i < M; i++) { // for que ira ler a matriz
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < M; i++) { // for que ira imprimir
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}

			System.out.println();
		}

		sc.close();
	}

}
