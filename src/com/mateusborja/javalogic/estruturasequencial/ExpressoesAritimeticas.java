//java expressions
package com.mateusborja.javalogic.estruturasequencial;

public class ExpressoesAritimeticas {
	
	public static void main(String[] args) {
		
		/*regra de precedendia
		 * 1 lugar => *, /, %
		 * 2 lugar => +, -
		 * Quando a precedencia for a mesma a regra diz que a
		 * operaçao deve ser da esquerda para direita
		 * Quando houver parenteses primeiro o parenteses
		 */
		
		int x1, y1, z1;
		
		x1 = 2;
		y1 = 6; 
		z1 = 3;
		
		int s1 =  x1 * y1 / z1;
		System.out.println("O Resultado é: => " + s1); // value is 4
		
		int x2, y2, z2;
		x2 = 3;
		y2 = 2; 
		z2 = 4;
		
		int s2 =  x2 + y2 * z2;
		System.out.println("O Resultado é: => " + s2); // value is 11
		
		int x3, y3, z3;
		x3 = 3;
		y3 = 2; 
		z3 = 4;
		
		int s3 =  (x3 + y3) * z3;
		System.out.println("O Resultado é: => " + s3); // value is 20
		
		
		int x4, y4, z4, w4;
		x4 = 60;
		y4 = 3; 
		z4 = 2;
		w4 = 4;
		
		int s4 =  x4 / (y4 + z4) * w4; // 3 + 2 
		System.out.println("O Resultado é: => " + s4); // value is 48
		
		int x5, y5, z5, w5;
		x5 = 60;
		y5 = 3; 
		z5 = 2;
		w5 = 4;
		
		int s5 =  x5 / ((y5 + z5) * w5); // 3 + 2 
		System.out.println("O Resultado é: => " + s5); // value is 48
		
		
		
		
		
	}

}
