//java volume esfera
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1011 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double pi = 3.14159, raio, volumeEsfera;
		
		raio = sc.nextDouble();
		
		volumeEsfera = (4/3.0) * pi * raio * raio * raio;
		
		System.out.printf("VOLUME = %.3f%n", volumeEsfera);
		
		
		
	}

}
