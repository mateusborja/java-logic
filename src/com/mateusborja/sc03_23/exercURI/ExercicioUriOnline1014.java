//java uri 1014 numero maior entre 3 numeros
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, z, maiorXY, maiorXYZ;

		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		maiorXY = (x + y + Math.abs(x - y)) / 2;

		maiorXYZ = (maiorXY + z + Math.abs(maiorXY - z)) / 2;

		System.out.println(maiorXYZ + " eh o maior");

	}

}
