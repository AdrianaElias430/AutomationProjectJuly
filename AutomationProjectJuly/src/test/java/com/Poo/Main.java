package com.Poo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos nuestro objeto
		Perro Labrador = new Perro(4,"Dorado", "Grande", "Golden Labrador");
		
		System.out.println("Mi perro es de raza" + Labrador.getRaza());
		
		Perro Chihuahua = new Perro(4,"Blanco", "Chico", "Cabeza de Manzana");
		
		System.out.println("Mi perro es de raza" + Chihuahua.getRaza());
		
		System.out.println("Mi perro tiene " + Chihuahua.getnumPatas());
		
		Perro perro2 = new Perro("Blanco", "Chico", "Chihuahua Golden");
		perro2.setnumPatas(1000);
		System.out.println("Mi perro es de raza" + perro2.getRaza() + " y mi perro tiene " +  perro2.getnumPatas());
	}

}
