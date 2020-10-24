//java functions and example
package com.mateusborja.sc03_20.funcoesmatematicas;

public class FuncaoMatematica02 {

	public static void main(String[] args) {

		double a, b, c, delta, x1, x2;

		a = 150;
		b = 25;
		c = 38;

		// formula de bascara
		delta = Math.pow(b, 2.0) - 4 * a * c;

		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.printf("%.2f%n%.2f%n%.2f%n", delta, x1, x2);

	}

}
