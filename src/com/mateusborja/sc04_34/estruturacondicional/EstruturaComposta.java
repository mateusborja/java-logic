//java if(se) and else (senao)
package com.mateusborja.sc04_34.estruturacondicional;

import java.util.Scanner;

public class EstruturaComposta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Digite as horas: ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia...");

		} else {

			System.out.println("Boa tarde...");
		}
		
		sc.close();

	}

}
