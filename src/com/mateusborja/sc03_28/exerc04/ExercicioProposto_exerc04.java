/* java 
 * uri online 1019
 */
package com.mateusborja.sc03_28.exerc04;

import java.util.Scanner;

public class ExercicioProposto_exerc04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, resto, horas, minutos, segundos;

		N = sc.nextInt();

		horas = N / 3600; // em horas
		resto = N % 3600;

		minutos = resto / 60; // 60min

		segundos = resto % 60; // em segundos

		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}
