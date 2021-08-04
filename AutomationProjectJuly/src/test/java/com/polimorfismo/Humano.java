package com.polimorfismo;

public class Humano extends Animal{
	
	
	public Humano() {
		super("Humano");
		}
	
	
	@Override //significa que hay una clase abstracta, mismo metodo, clase padre padre y clase hijo
	public void speak() {
		System.out.println("Habla");
	
		
	}

}
