//java uri online cedulas 1018
/*
 * Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) 
 * no qual o valor pode ser decomposto. As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1.
 *  A seguir mostre o valor lido e a rela��o de notas necess�rias.
 *  Entrada - O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).
 *  Sa�da - Imprima o valor lido e, em seguida, a quantidade m�nima de notas de 
 *  cada tipo necess�rias, conforme o exemplo fornecido. N�o esque�a de imprimir o 
 *  fim de linha ap�s cada linha, caso contr�rio seu programa apresentar� a mensagem: 
 *  �Presentation Error�.


 */
package com.mateusborja.sc03_23.exercURI;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUriOnline1018 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int nota, quociente, N, resto;
		
		N = sc.nextInt();
		System.out.println(N);
		
		resto = N;
		
		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 5;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 1;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		sc.close();
		

	}

}
