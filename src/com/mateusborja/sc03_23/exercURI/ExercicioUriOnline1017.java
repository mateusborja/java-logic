//java gasto combustivel
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1017 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo, velocidade;
		double litros;

		tempo = sc.nextInt();
		velocidade = sc.nextInt();

		litros = (double) tempo * velocidade / 12.0;

		System.out.printf("%.3f%n", litros); //qtde de litros 10h, tempo gasto 85km/h, velocidade

	}

}
