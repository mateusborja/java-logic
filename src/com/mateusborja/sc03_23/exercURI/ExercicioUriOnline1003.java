//java URI online
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1003 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, SOMA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		SOMA = A + B;
		System.out.println("SOMA = " + SOMA);
		
		sc.close();
		
	}

}
