package com.java;

public class Array {

	public static void main(String[] args) {
		
		//arreglo unidimensional
	
		String [] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		
		System.out.println("El dia de hoy es " + dias[5]);
		
		for(int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}

		//Arreglo bidimensional
		
		String [][] nombreCompleto = new String[4][2];
		
		nombreCompleto[0][0] = "Ricardo"; 
		nombreCompleto[0][1] = "Avalos";
		nombreCompleto[1][0] = "Oscar";
		nombreCompleto[1][1] = "Trujillo";
		nombreCompleto[2][0] = "Sonia";
		nombreCompleto[2][1] = "Rojas";
		nombreCompleto[3][0] = "Alejandra";
		nombreCompleto[3][1] = "Soria";
		
		//System.out.println("El nombre completo es " + nombreCompleto [0][0] +" "+ nombreCompleto [0][1]);
		
		for(int i = 0; i < nombreCompleto.length; i++) {
			System.out.println("El nombre completo es " + nombreCompleto [i][0] +" "+ nombreCompleto [i][1]);
		}	
	}

}
