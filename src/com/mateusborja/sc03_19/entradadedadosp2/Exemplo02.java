//java input type
package com.mateusborja.sc03_19.entradadedadosp2;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age;
		String s1, s2, s3;

		System.out.println("Informe os dados abaixo: \r\n" + "Nome: \r\n" + "Idade: \r\n" + "Estado Civil: \r\n"
				+ "Profissão: \r\n" + "");

		s1 = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("\nDados informados: ");
		System.out.println(s1);
		System.out.println(age);
		System.out.println(s2);
		System.out.println(s3);

	}

}
