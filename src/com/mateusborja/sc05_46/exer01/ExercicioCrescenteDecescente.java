//java uri crescente - decrescente // 1113
package com.mateusborja.sc05_46.exer01;

import java.util.Scanner;

public class ExercicioCrescenteDecescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != Y) {

			if (X < Y) {

				System.out.println("Crescente");
				
			} else {
				System.out.println("Decrescente");

			}

			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();

	}

}
