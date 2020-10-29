/*java vetores imprimir colecao 
 * de vetores apenas os digitados negativos
 */

package com.mateusborja.sc06_61.exer01;

import java.util.Scanner;

public class NumerosLidosENegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//quantidade de elementos no vetor
		int n = sc.nextInt();

		//vetor vet recebe n elementos
		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println("numeros negativos: " + vet[i]);
			}

		}

		sc.close();

	}

}
