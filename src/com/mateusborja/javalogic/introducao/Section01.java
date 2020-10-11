package com.mateusborja.javalogic.introducao;

public class Section01 {

	private String name;
	private int age;
	private double height;
	private double weight;

	public Section01(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}
	

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public Section01() {
		
	}
	
	
	public String toString() {
		return super.toString()+ "Seu noeme é: =>" + name + "Sua altura é: =>" + height + "E seu peso é: =>" + weight;
	}

}
