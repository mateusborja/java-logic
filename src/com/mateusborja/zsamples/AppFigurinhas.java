//java instace and java methods
package com.mateusborja.zsamples;

public class AppFigurinhas {
	
	public static void main(String[] args) {
		
		Figurinhas p1 = new Figurinhas();
		Figurinhas p2 = new Figurinhas();
		
		p1.nome = "Iracema Alves";
		p1.receber(100);
		p1.doar(15, p1);
		
		p2.nome = "João Honório";
		p2.receber(10);
		p2.doar(2, p1);
		
		
		System.out.println(p1.toString());
		
		
		
	}

}
