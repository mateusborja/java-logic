package com.mateusborja.javalogic.introducao;

import java.util.Scanner;

public class AppMedia {
	
	public static void main(String[] args) {
		
		Scanner md = new Scanner (System.in);
		double x, y, media;
		
		System.out.println("Digite o primeiro Número: =>");
		x = md.nextDouble();

		System.out.println("Digite o segundo Número: =>");
		y = md.nextDouble();
		
		media = (x + y) / 2;
		
		System.out.println("A média é: => " + media);
		
		
		
	}

}
