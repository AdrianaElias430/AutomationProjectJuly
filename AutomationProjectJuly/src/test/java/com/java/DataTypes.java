package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte abc = 127;  // tipo de variable -- nombre -- equivalencia, esta es la estructura
		short var = 30;
		
		double altura = 2.54;
		System.out.print(altura);
		
		char letra = '\u00D6';
		System.out.println(letra);
		
		String frase = "Hola";
		String frase1 = "Mundo";
		int frase2 = 5;
		
		
		System.out.println(frase+frase1+frase2);
		
		
		boolean isDog = false;  //son utilizados en condiciones, tambien puede ser un valor nulo null
		
		//Aritmeticos
		int x = 3;
		int y = 4;
		int suma = x + y;
		System.out.println("El valor de la suma es: " + suma);
		
		//Unario 
		int a = 3;
		int b = 4;
		a++;
		System.out.println("El valor de a es: " + a);
		
		//Relacionales y Operadores condicionales
		int var1 = 3;
		int var2 = 4;
		boolean var3 = true;
		
		if( var1 <= var2 && var3) {
			System.out.println("Here");
		}
		
		
		
		
		
		
		
		

	}

}
