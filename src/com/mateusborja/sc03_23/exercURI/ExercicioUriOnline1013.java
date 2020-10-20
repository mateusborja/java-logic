//java uri online 1013
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1013 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, z, maiorxy, maiorxyz;

		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		maiorxy = (x + y + Math.abs(x - y) / 2);
		maiorxyz = (maiorxy + z + Math.abs(maiorxy - z) / 2);

		System.out.println(maiorxyz + " eh o maior");

	}

}
