package com.nov;

public class Calculator {

	public static void main(String aa[]) {
		
		System.out.println("******************Lambda Style******************");
		
		calculator sumLamda = (x,y)->x+y;
		System.out.println("Sum result: "+sumLamda.performCalculation(12, 12));
		
		calculator subtractLamda = (x,y)->x-y;
		System.out.println("Subtraction result: "+subtractLamda.performCalculation(20, 12));
		
		calculator multiplyLamda = (x,y)->x*y;
		System.out.println("Multiplication result: "+multiplyLamda.performCalculation(10, 10));
		
		calculator divideLamda = (x,y)->x/y;
		System.out.println("Divison result: "+divideLamda.performCalculation(10, 2));
	}
	
	interface calculator{
		int performCalculation(int x, int y);
	}
}
