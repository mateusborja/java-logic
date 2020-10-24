//java method printf
package com.mateusborja.sc03_16.saidadedados;

import java.util.Locale;

public class AplicacaoSaidaDeDados {
	
	public static void main(String[] args) {
		
		System.out.print("Ola mundo!"); //print nao ha quebra de linha
		System.out.println(" Bom dia!"); // println ha quebra de linha
		
		
		int y = 32;
		
		
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x); 
		System.out.printf("%.2f%n", x); //printf - formata com duas casas decimais "%.2f%n", mais a variavel (printf pega o formato do padrao utilizado pelo computador)
		System.out.printf("%.4f%n", x); //printf - formata com quatro casas decimais "%.4f%n", mais a variavel
		Locale.setDefault(Locale.US); // define a localizacao
		System.out.printf("%.4f%n", x); //printf - formata com quatro casas decimais "%.4f%n", mais a variavel
		System.out.println("RESULTADO = " + x + " METROS."); //println
		System.out.printf("RESULTADO => %.2f metros%n", x); // contatenando com printf => %.2f e substituido pela variavel x
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda); //%s texto, %d inteiro, %f ponto flutuate, %n quebra de linha (valores interpolados)
		
		
		
	}

}
