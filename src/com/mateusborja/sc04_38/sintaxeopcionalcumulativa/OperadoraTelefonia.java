package com.mateusborja.sc04_38.sintaxeopcionalcumulativa;

import java.util.Locale;
import java.util.Scanner;

public class OperadoraTelefonia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double minutos;
		double conta = 50.0;

		System.out.print("Minutos utilizados: ");
		minutos = sc.nextDouble();
		double taxa = minutos - 100;

		if (minutos > 100) {
			// conta = conta + (minutos - 100) * 2.0;
			conta += taxa * 2.0;
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();

	}

}
