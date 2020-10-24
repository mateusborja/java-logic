//java functions
package com.mateusborja.sc03_20.funcoesmatematicas;

public class FuncaoMatematica01 {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4;
		double z = -5.0;

		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);

		System.out.printf("Raiz quadrada é: => %.4f%n", A);
		System.out.println("Raiz quadrada é: => " + B);
		System.out.println("Raiz quadrada é: => " + C + "\n");

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + " elevado a: => " + y + " é igual a: " + A);
		System.out.println(x + " elevado ao quadrado é igual a: => " + B);
		System.out.println("5 elevado ao quadrado é igual a: => " + C + "\n");
		
		A = Math.abs(x);
		B = Math.abs(z); // valor positivo
		System.out.println("Valor absoluto é: => " + A);
		System.out.println("Valor absoluto é: => " + B);
		
		
		
	}

}
