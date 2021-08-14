package com.javaBasico;

public class VerificadorSumaNumero {

	public static void main(String[] args) {
		
		boolean resultado;
		
		resultado = hasEqualSum(1,1,1);
		System.out.println(hasEqualSum(1,1,1));
		resultado = hasEqualSum(1,1,2);
		System.out.println(resultado);

	}
	
	public static boolean hasEqualSum(int num1, int num2, int num3) {
			
		int suma = num1 + num2;
		if (suma == num3) {
			return true;
		} 
		else return false;
	}

}
