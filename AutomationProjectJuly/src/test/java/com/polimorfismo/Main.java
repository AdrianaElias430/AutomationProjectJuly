package com.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Animal humano = new Humano();
		humano.speak();
		
		Animal gato = new Gato();
		gato.speak();
		
		Animal animal = new Humano();
		animal.speak();
		
		animal = new Gato();
		animal.speak();
		
		
	}

}
