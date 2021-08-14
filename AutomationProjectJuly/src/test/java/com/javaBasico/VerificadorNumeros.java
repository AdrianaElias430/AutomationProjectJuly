package com.javaBasico;


public class VerificadorNumeros {

	public static void main(String[] args) {

		imprimirVerificadorNumeros(1,1,1);

		imprimirVerificadorNumeros(1,1,2);

		imprimirVerificadorNumeros(-1,-1,-1);

		imprimirVerificadorNumeros(1,2,3);

	}

	public static void imprimirVerificadorNumeros(int num1, int num2, int num3) {
		
		if(num1 < 0 || num2 < 0 || num3 < 0) {
			System.out.println("Valor no válido");
		}else if(num1 == num2 && num2 == num3) {
			System.out.println("Todos los números son iguales");
		}else if (num1 != num2 && num2!=num3  && num3!=num1) {
			System.out.println("Todos los números son diferentes");
		}else System.out.println("Ni todos son iguales ni diferentes");
	}

}
