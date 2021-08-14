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
			System.out.println("Valor no v�lido");
		}else if(num1 == num2 && num2 == num3) {
			System.out.println("Todos los n�meros son iguales");
		}else if (num1 != num2 && num2!=num3  && num3!=num1) {
			System.out.println("Todos los n�meros son diferentes");
		}else System.out.println("Ni todos son iguales ni diferentes");
	}

}
