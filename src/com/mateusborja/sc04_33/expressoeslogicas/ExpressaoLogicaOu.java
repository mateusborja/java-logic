//java logic expressions
package com.mateusborja.sc04_33.expressoeslogicas;

public class ExpressaoLogicaOu {

	public static void main(String[] args) {

		int x = 5;

		if (x == 10 || x <= 20) {
			System.out.println("Resultado Verdadeiro" + " (x == 10 || x <= 20)");

		} else
			System.out.println("Resultado Falso" + "(x == 10 || x <= 20)");

		if (x > 0 || x != 3) {
			System.out.println("Resultado Verdadeiro" + " (x > 0 || x != 3)");

		} else
			System.out.println("Resultado Falso" + " (x > 0 || x != 3)");

		if (x <= 0 || x != 3 || x != 5) {
			System.out.println("Resultado Verdadeiro" + " (x <=0 || x != 3 || x != 5)");

		} else
			System.out.println("Resultado Falso" + " (x <=0 || x != 3 || x != 5)");

	}

}
