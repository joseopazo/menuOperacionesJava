package com.desafio.menu;

import java.util.Scanner;

public class ConversionTemperatura {
	
	public void ejecutar( Scanner scan) {
		
	        System.out.print("Ingrese la temperatura en grados Celsius: ");
	        double celsius = scan.nextDouble();
	        double fahrenheit = (celsius * 9 / 5) + 32;
	        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
	      
	}

}
