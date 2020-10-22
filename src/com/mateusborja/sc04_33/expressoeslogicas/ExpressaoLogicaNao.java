//java 
package com.mateusborja.sc04_33.expressoeslogicas;

public class ExpressaoLogicaNao {

	public static void main(String[] args) {

		int x = 5;

		if (!(x != 5)) {
			System.out.println("Resultado Verdadeiro" + " (!(x != 5))");

		} else
			System.out.println("Resultado Falso" + " (!(x != 5))");

		if (!(x > 0)) {
			System.out.println("Resultado Verdadeiro" + " (!(x > 0))");

		} else
			System.out.println("Resultado Falso" + " (!(x > 0))");

		if (!(x >= 5) || !(x != 3)) {
			System.out.println("Resultado Verdadeiro" + " (!(x >= 5) || !(x != 3))");

		} else
			System.out.println("Resultado Falso" + " (!(x >= 5) || !(x != 3))");

	}

}
