package com.Poo;

public class Perro {
	
	//Variable de instancia, ayuda a contruir nuestro objeto perro
	int numPatas;
	String color, tamano, raza;
	
	//Constructor perro, no devuelve nada, por eso creamos el metodo getRaza
	public Perro(int numPatas, String color, String tamano, String raza){
		this.numPatas = numPatas;
		this.color = color;
		this.tamano = tamano;
		this.raza = raza;
	}
	
	public Perro(String color, String tamano, String raza){
		this.numPatas = 3;
		this.color = color;
		this.tamano = tamano;
		this.raza = raza;
	}
	
	//Creamos el metodo getRaza
	public String getRaza(){
		return this.raza;
	}
	
	public int getnumPatas() {
		return this.numPatas;
	}
	
	public void setRaza(String Raza) {
		this.raza = Raza;
	}
	
	public void setnumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
}
