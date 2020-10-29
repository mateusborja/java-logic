//java for uri 1078 - tabuada
package com.mateusborja.sc05_52.exerURI;

import java.util.Scanner;

public class uri1078Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}

		sc.close();

	}

}
