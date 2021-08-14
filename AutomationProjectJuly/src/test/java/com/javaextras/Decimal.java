package com.javaextras;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Decimal {

	public static void main(String[] args) {
		

		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
	
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
	
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
	
		param1 = param1 * 1000;
		param2 = param2 * 1000;
		
		int converter1 = (int) param1;
		int converter2 = (int) param2;
		
		if(converter1 == converter2) {
			return true;
		} else {
			return false;
		}
		
	} 
 
}
