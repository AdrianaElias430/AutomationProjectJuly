package com.polimorfismo;

public abstract class Animal {
	
	//solo puede tener metodos abstractos
	
	public abstract void speak();
	
	String animal;
	
	public Animal(String animal) {
		this.animal = animal;
	}
	
	public String getAnimal()	{
		return this.animal;
		}
	

}
