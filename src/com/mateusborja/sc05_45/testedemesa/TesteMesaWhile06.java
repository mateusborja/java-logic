//java while teste mesa 05
package com.mateusborja.sc05_45.testedemesa;

public class TesteMesa06 {
	
	public static void main(String[] args) {
		
		int x = 2, y = 10;
		System.out.println("Ola");
		
		while (x < y) {
			System.out.println(x + " - " + y);
			x = x *2;
			y = y + 1; //y++
		}
		
	}

}
