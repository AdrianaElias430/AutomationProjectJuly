package com.javaBasico;

public class Gato {

	public static void main(String[] args) {
		boolean resultado;

		resultado = isCatPlaying(true, 10);
		System.out.println(resultado);
		resultado = isCatPlaying(false, 36);
		System.out.println(resultado);
		resultado = isCatPlaying(false, 35);
		System.out.println(resultado);

	}

	public static boolean isCatPlaying(boolean verano,int temperatura)
	{	

		if (verano) 
		{
			if(temperatura >= 25 && temperatura <= 45)
				return true;
			else
				return false;

		}
		else 
		{
			if (temperatura >=25 && temperatura <= 35) 
				return true;
			else
				return false;
		}

	}
}
