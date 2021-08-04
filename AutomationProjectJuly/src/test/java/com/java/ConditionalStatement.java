package com.java;

import org.apache.poi.util.SystemOutLogger;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int velocidad = 90; //km x hora
		int limiteVelocidad = 80; // limite de velocidad
		

		//if anidado IF Else IF
		
		boolean carretera = true;
		
		if(carretera) {
			System.out.println("Carretera");
			
			limiteVelocidad = 110;
			
			if(velocidad > limiteVelocidad) {
				System.out.println("El coche va a exceso de velocidad, multa!!");
			}else {
				System.out.println("El coche va a la velocidad adecuada, Felicidades");
			}
			
		}else if(velocidad > limiteVelocidad) {
			System.out.println("Calle");
			System.out.println("El coche va a exceso de velocidad, multa!!");
		}else {
			System.out.println("El coche va a la velocidad adecuada, Felicidades");
		}
		
		
		//Switch Case, otra manera de manejar condiciones
		
		
		int temperatura = 15;
		
		switch(temperatura) {
		
		case 5:
			System.out.println("Clima Muy Frio");
			break;
			
		case 10:
		case 15:
			System.out.println("Clima Frio");
			break;
	
		case 20:
		case 25:
		System.out.println("Clima Templado");
			break;
			
		case 30:
			System.out.println("Clima Calido");
			break;
			
		default:
			System.out.println("Clima no reconocible por el sistema");
			break;
		}
		
	}

}
