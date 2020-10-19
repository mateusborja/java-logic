//java input
package com.mateusborja.sc03_18.entradadedadosp1;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next(); // strings
		System.out.println("Você digitou: => " + x);

		int y;
		y = sc.nextInt(); // numeros
		System.out.println("Você digitou: => " + y);

		double z;
		z = sc.nextDouble();
		System.out.printf("Você digitou: => %.2f%n", z);

		char a;
		a = sc.next().charAt(0); // chama a string com a funcao charAt()
		System.out.println(a);
		
		String m;
		int n;
		double o;
		
		m = sc.next();
		n = sc.nextInt();
		o = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		
		sc.close(); // necessario encessar o recurso

	}

}
